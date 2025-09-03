FROM openjdk:17-slim

WORKDIR /app

COPY HelloWorld.java .

RUN javac HelloWorld.java

CMD ["hava", "HelloWorld"]