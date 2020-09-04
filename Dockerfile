FROM openjdk:8-jdk-alpine
COPY target/springbootdocker.jar /app/app.jar
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]