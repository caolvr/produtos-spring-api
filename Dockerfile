FROM openjdk:11
COPY /target/produtos-api-0.0.1-SNAPSHOT.jar produtos-spring.jar
ENTRYPOINT ["java", "-jar", "produtos-spring.jar"]