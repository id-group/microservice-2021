#Kubeclt

kubectl delete all --all

##nodes

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

kubectl set image deployment/user-deployment user-py=user-py:v2

##Ingress
minikube addons enable ingress  

##statefulset

kubectl get pvc  
kubectl get pv

psql -h 127.0.0.1 -p 58941 -U myuser -W otus

minikube service hello-service --url -n otus

# Docker
docker build . -t user-py:v1  
docker tag user-py idgroup/user-py:v1  
docker push idgroup/user-py:v1

#Minikube

minikube start --vm-driver=docker   

minikube addons list  

##пробросить порт на сервис 
minikube service postgres -n myapp --url user-service

#Helm

helm create hello-chart

###Проверка установки  
helm install myapp ./hello-chart --dry-run
###Установка
helm install myapp ./hello-chart

### encode64 
echo -n 'passwd' | base64

### Очистка
helm uninstall myapp  
kubectl delete all --all

kubectl get pvc
kubectl delete pvc postgredb-postgres-statefulset-0
kubectl get pv

