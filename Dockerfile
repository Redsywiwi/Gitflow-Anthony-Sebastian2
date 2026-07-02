# Usamos una imagen ligera de Java 17
FROM eclipse-temurin:17-jre-alpine

# Definimos el directorio de trabajo
WORKDIR /app

# Copiamos el JAR que ya generaste en la carpeta target
# Asegúrate de que el nombre coincida exactamente con el que ves en tu carpeta
COPY target/juegos-0.0.1-SNAPSHOT.jar app.jar

# Exponemos el puerto
EXPOSE 3000

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]