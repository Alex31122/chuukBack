# Utiliza una imagen base con Java, optimizada para Spring Boot
FROM openjdk:17-jdk-slim

# Crea un volumen para la aplicación
VOLUME /tmp

# Copia el archivo JAR de tu aplicación al contenedor
# Asegúrate de que el nombre del archivo JAR coincida con el tuyo
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Define el comando de entrada para ejecutar la aplicación
ENTRYPOINT ["java","-jar","/app.jar"]