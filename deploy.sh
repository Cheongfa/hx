#!/bin/bash
imageTag=`awk '/- image: /{print$3;exit}' huaxin.yaml`
#echo "delete deployment ..."
#kubectl --namespace=fa delete deployment huaxin-dev
#sleep 5
echo "using kubernetes to deploy"
#sed -i.bak 's#10.10.103.185:5000/${imageTag}#' ./*.yaml
kubectl --namespace=fa apply -f "huaxin.yaml"
echo "apply succeed"
echo "remove local images for package"
docker rmi -f ${imageTag}
echo "done"
