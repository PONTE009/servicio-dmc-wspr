FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY build/libs/service.dmc.wspr-0.0.1-SNAPSHOT.jar service.dmc.wspr-0.0.1-SNAPSHOT.jar

EXPOSE 8090
ENTRYPOINT ["java", "-jar", "service.dmc.wspr-0.0.1-SNAPSHOT.jar"]
