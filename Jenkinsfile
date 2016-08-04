#!groovy

stage 'Dev'
node {
    checkout scm
    mvn 'clean package'
    dir('target') {stash name: 'war', includes: 'hx-1.war'}
}

stage 'QA'
parallel(longerTests: {
    runTests(10)
}, quickerTests: {
    runTests(5)
})
stage  'push war to docker registry'
node {
    unstash 'war'
    // sh "cp hx.war /tmp/dockerhub.war"
    sh "./buildimage.sh"
    // sh "docker push "
}
stage name: 'Staging', concurrency: 1
node {
    deploy 'staging'
}

input message: "Does staging look good?"
try {
    checkpoint('Before production')
} catch (NoSuchMethodError _) {
    echo 'Checkpoint feature available in CloudBees Jenkins Enterprise.'
}
stage 'use kubernetes to deploy'
node {
//sh "docker pull "
    sh "./deploy.sh"
}
stage name: 'Production', concurrency: 1
node {
    echo 'Production server looks to be alive'
    deploy 'production'
    echo "Deployed to production"
}

def mvn(args) {
    sh "${tool 'MAVEN'}/bin/mvn ${args}"
}

def runTests(duration) {
    node {
        sh "sleep ${duration}"
        }
    }

def deploy(id) {
    unstash 'war'
    sh "cp hx-1.war /tmp/${id}.war"
}

def undeploy(id) {
    sh "rm /tmp/${id}.war"
}
