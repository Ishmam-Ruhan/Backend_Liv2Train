FROM maven:3.8.4-openjdk-17-slim AS maven_build

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN --mount=type=cache,target=/root/.m2 mvn -o package -DskipTests

COPY target/Liv2Train-Assesment-v1.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
