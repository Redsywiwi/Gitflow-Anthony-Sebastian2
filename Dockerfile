# 1. Fase de construcción
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# 2. Fase de ejecución
FROM openjdk:17-jdk-slim
WORKDIR /app
# Asegúrate de que el nombre del jar coincida con el que genera tu proyecto (revisa la carpeta target)
COPY --from=build /app/target/*.jar app.jar
EXPOSE 3000
ENTRYPOINT ["java", "-jar", "app.jar"]