# Bruk offisiell OpenJDK 17 image som base
FROM eclipse-temurin:17-jdk-alpine

# Sett arbeidsmappe i containeren
WORKDIR /app

# Kopier ferdig bygget jar-fil inn i containeren
COPY target/*.jar app.jar

# Eksponer porten applikasjonen kjører på (standard Spring Boot port)
EXPOSE 8080

# Kommando for å starte applikasjonen
ENTRYPOINT ["java", "-jar", "app.jar"]
