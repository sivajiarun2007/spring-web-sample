FROM openjdk:24-jdk
ADD target/test-webapp.jar test-webapp.jar
ENTRYPOINT ["java","-jar", "/test-webapp.jar"]