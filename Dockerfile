FROM maven:3-openjdk-11

WORKDIR /usr/src/app

COPY . .


EXPOSE 8080

CMD ["java","-jar","sv70-2021-cloud-kolokvijum-0.0.1-SNAPSHOT.jar"]