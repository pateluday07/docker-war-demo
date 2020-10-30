FROM tomcat:jdk11-openjdk-slim-buster

MAINTAINER pateluday07@gmail.com

COPY target/docker-war-demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/docker-war-demo.war

CMD ["catalina.sh", "run"]