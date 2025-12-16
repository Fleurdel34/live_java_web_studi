# Construction de l'image docker
FROM maven:3.9.9-eclipse-temurin-21-alpine AS build

#créer un répertoire de travail
#mkdir /app && cd
WORKDIR /app

#je copie mon projet
COPY . .

#telechargement des dépendances & compilation
RUN mvn clean package -DskipTests -Pdocker

# execute le code : JRE
FROM eclipse-temurin:21.0.7_6-jre-alpine-3.21

WORKDIR /app

COPY --from=build /app/target/*.war application.war

EXPOSE 8080

#commande de lancement applicative
ENTRYPOINT  ["java", "-jar", "/app/application.war","--spring.profiles.active=docker"]
