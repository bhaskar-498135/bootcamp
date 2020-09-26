 FROM tomcat:9.0-alpine
 
 EXPOSE 8888
 
 ARG WAR_FILE=target/*.war
 
 COPY ${WAR_FILE} /opt/tomcat/webapps/app.war
 
 
 MAINTAINER "mavurubhaskar@gmail.com"
