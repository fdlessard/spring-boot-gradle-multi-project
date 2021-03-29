# spring-boot-customer

docker images
docker image rm spring-boot-order
docker build . -t customer
docker run -p 8080:8080 customer


kubectl version
kubectl get nodes
kubectl get pods

kubectl get replicaset

kubectl get deployments
kubectl describe deployments

kubectl delete deployment customer
kubectl create deployment customer --image=customer
kubectl expose deployment customer --type=NodePort --port=8080 


