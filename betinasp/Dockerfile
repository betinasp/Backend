#FROM amazoncorretto:8-alpine-jdk

#LABEL MAINTAINER "betinaspotto"

#COPY target/betinasp-0.0.1-SNAPSHOT.jar betinasp-0.0.1-SNAPSHOT.jar

#ENTRYPOINT ["java","-jar","/betinasp-0.0.1-SNAPSHOT.jar"]

FROM openjdk:8-jdk-slim
MAINTAINER betinaspotto
ADD target/betinasp-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]

#COPY --from=build /target/betinasp-0.0.1-SNAPSHOT.jar betinasp-0.0.1-SNAPSHOT.jar
    # ENV PORT=8080
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","betinasp-0.0.1-SNAPSHOT.jar"]

