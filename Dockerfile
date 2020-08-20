FROM openjdk:14-jdk-alpine
VOLUME /tmp
ADD /var/jenkins_home/workspace/mongodb-consumer/maven-long/target/mongodb-consumer-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
