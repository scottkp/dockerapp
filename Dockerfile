FROM maven:latest
WORKDIR /usr/src
RUN git clone https://github.com/scottkp/dockerapp.git
WORKDIR /usr/src/dockerapp
RUN ls
RUN mvn clean install
EXPOSE 8080

#RUN java -jar target/dockerapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar target/dockerapp-0.0.1-SNAPSHOT.jar" ]