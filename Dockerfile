FROM openjdk:21-slim-buster
COPY . .
WORKDIR .
RUN javac ./*.java
CMD ["java", "Main"]