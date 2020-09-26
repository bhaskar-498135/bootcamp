 FROM tomcat:7.0
 
 EXPOSE 8888
 
 ARG WAR_FILE=target/*.war
 
 COPY ${WAR_FILE} /opt/tomcat/webapps/app.war
 
 
 MAINTAINER "mavurubhaskar@gmail.com"
