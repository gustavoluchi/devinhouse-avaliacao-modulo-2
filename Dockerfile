FROM openjdk:11
ADD target/primeiraavaliacao-0.0.1-SNAPSHOT.jar primeiraavaliacao-0.0.1-SNAPSHOT.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "primeiraavaliacao-0.0.1-SNAPSHOT.jar"]