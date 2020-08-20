FROM openjdk:14-jdk-alpine
VOLUME /tmp
ADD mongodb-consumer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mongodb-consumer-0.0.1-SNAPSHOT.jar"]
