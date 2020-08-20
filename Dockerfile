FROM openjdk:14-jdk-alpine
VOLUME /tmp
COPY /var/jenkins_home/workspace/mongodb-consumer/maven-long/target/mongodb-consumer-0.0.1-SNAPSHOT.jar /var/lib/docker/tmp/docker-builder${env.BUILD_ID}/target/
ADD target/mongodb-consumer-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
