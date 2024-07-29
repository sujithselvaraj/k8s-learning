## demo k8s learning

After completing the project build the project using the 

`mvn clean install`

Create a docker file 

And build the image using the docker command 

`docker build -t myapp .`

And run the container

Next step is to apply the deployment.yaml

`kubectl apply -f deployment.yaml`

For port forwarding using the command

 `kubectl port-forward pod/<pod-name> <mapping-port>:<project-port>`
