FROM openjdk:14-jdk-alpine
VOLUME /tmp
ADD BuiltJar.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
