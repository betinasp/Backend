
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

#FROM alpine:latest

#CMD ["/bin/sh"]
#FROM openjdk:8-alpine-jdk
#MAINTAINER emaaristimuno
#COPY target/betinasp-0.0.1-SNAPSHOT.jar app.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","app.jar"]
FROM amazoncorretto:8-alpine-jdk
MAINTAINER emaaristimuno
COPY target/betinasp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
