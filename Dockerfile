FROM openjdk:14-jdk-alpine
VOLUME /tmp
ADD $JENKINS_HOME/jars/mongodb-consumer-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
