 FROM tomcat:9.0-alpine
 
 EXPOSE 8888
 
 ARG WAR_FILE=/*.war
 
 COPY ${WAR_FILE} /opt/tomcat/webapps/app.war
 
 
 MAINTAINER "mavurubhaskar@gmail.com"
