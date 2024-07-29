FROM openjdk:17-jdk-slim
EXPOSE 8080
COPY target/app-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "/app-0.0.1-SNAPSHOT.jar"]