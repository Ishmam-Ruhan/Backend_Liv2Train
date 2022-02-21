FROM maven:3.8.4-openjdk-17-slim AS maven_build

RUN mkdir app

COPY pom.xml /app/

COPY src /app/src/

#RUN --mount=type=cache,target=/root/.m2 mvn -o package -DskipTests
RUN mvn -f /app/pom.xml clean package -DskipTests


FROM openjdk:17-alpine

COPY --from=maven_build /app/target/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
