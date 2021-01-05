# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine

# Copy war file
COPY skeleton-0.0.1-SNAPSHOT.jar /api.war

# run the app
CMD ["/usr/bin/java", "-jar", "/api.war"]
