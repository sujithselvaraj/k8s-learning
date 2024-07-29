## demo k8s learning

After completing the project build the project using the 

`mvn clean install`

Create a docker file 

And build the image using the docker command 

`docker build -t myapp .`

And run the container

Next step is to apply the deployment.yaml

`kubectl apply -f deployment.yaml`



This repo is to mainly concentrate for the service yaml which is used to port forward using the node port 

For this we need to mainly ``kubectl apply -f service.yaml` after the applying the deployment in it 


