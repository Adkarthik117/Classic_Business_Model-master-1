FROM openjdk:11
EXPOSE 8080
COPY target/cbm.jar cbm.jar
ENTRYPOINT ["java","-jar","/cbm.jar"]
