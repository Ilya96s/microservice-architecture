# Используем официальный базовый образ OpenJDK 17 с минимальными размерами
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию внутри контейнера
WORKDIR /app

# Копируем файл с зависимостями
COPY target/hw4-0.0.1-SNAPSHOT.jar /app/user-service.jar

# Открываем порт, который будет использоваться приложением
EXPOSE 8000

# Команда для запуска Spring Boot приложения
ENTRYPOINT ["java", "-jar", "/app/user-service.jar"]
