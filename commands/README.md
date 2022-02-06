#Kubeclt

kubectl get all  

kubectl get nodes  
kubectl get no  
kubectl get pods -n kube-system  


##Namespace
kubectl get namespaces  
kubectl create namespace otus
kubectl config set-context --current --namespace=otus

##Посмотреть все изменения в текущем namespace
kubectl get pod -w

kubectl describe deployments

##Ingress
minikube addons enable ingress  


minikube service hello-service --url -n otus
