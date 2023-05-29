FROM adoptopenjdk:11-jre-hotspot
RUN mkdir /app
COPY build/libs/healthCheck-0.0.1-SNAPSHOT.jar /app/healthcheck.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/healthcheck.jar"]
