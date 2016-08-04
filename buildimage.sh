#!/bin/bash
da=$(date +%s)
echo 'image tag :'${da}
image=10.10.103.185:5000/changfayu/myapp:
imageTag=${image}${da}
echo 'build image'
docker build -t="${imageTag}" .
echo 'push image to docker registry'
docker push ${imageTag}
sed -i.bak "s#10.10.103.185:5000/changfayu/myapp:[0-9]\{10\}#${imageTag}#" ./*.yaml
