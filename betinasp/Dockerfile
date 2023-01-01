FROM amazoncorretto:8-alpine-jdk

LABEL MAINTAINER "betinaspotto"

COPY betinasp/target/betinasp-0.0.1-SNAPSHOT.jar betinasp-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/betinasp-0.0.1-SNAPSHOT.jar"]

#FROM openjdk:11-jdk-slim
#COPY --from=build /target/betinasp-0.0.1-SNAPSHOT.jar betinasp-0.0.1-SNAPSHOT.jar
    # ENV PORT=8080
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","betinasp-0.0.1-SNAPSHOT.jar"]

