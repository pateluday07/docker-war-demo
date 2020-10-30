# docker-war-demo

This project will demonstrate how to deploy the WAR file in a 
docker container.

### Prerequisites
* Docker

Take reference to my **Dockerfile** and similarly prepare yours the
**Dockerfile** is available in the `/docker-war-demo` directory.

I have already prepared an image for this demo project, so to 
run that image execute the following command in the terminal:

    docker run -p 8080:8080 uday07/docker-war-demo

Once you execute the above command the WAR file will be run 
inside the Tomcat, and the Tomcat is running in the Docker 
container, Now you can interact with the WAR file by using the 
following test APIs:

* http://localhost:8080/docker-war-demo/
* http://localhost:8080/docker-war-demo/test

<p align="center">
  <b>Thank You :)</b>
</p>