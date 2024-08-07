#### IMPORTANTE: El MICROSERVICIO desplegado con este DOCKERFILE debería generar una IMAGE con un tamaño de: [532MB]. ####

#STAGE: [CONSTRUCTION]:
FROM maven:3.5-jdk-8-slim AS BUILD
WORKDIR /usr/src/app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

#STAGE: [EXECUTION]:
FROM icr.io/appcafe/open-liberty:kernel-slim-java8-openj9-ubi
COPY --chown=1001:0 src/main/liberty/config/server.xml /config/
RUN features.sh
COPY --from=build /usr/src/app/target/*.war /config/apps/
RUN configure.sh