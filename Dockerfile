FROM openjdk:17-oracle
COPY build/libs/Calculator-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
