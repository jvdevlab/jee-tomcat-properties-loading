FROM tomcat:10-jdk15-openjdk-slim

ARG WAR_NAME=app.war

# Overlay common.properties
WORKDIR /usr/local/tomcat
COPY conf .
# Copy WAR file 
COPY target/${WAR_NAME} ./webapps
# Update WAR with app.properties 
WORKDIR /usr/local/tomcat/webapps
RUN jar -uf ${WAR_NAME} app.properties && rm app.properties

EXPOSE 8080
CMD ["catalina.sh", "run"]