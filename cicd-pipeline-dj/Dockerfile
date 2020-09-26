 FROM tomcat:9.0
 
 EXPOSE 8888
 
 ARG WAR_FILE=target/*.war
 ARG conf=tomcat-users.xml

 COPY ${conf} /usr/local/tomcat/conf/tomcat-users.xml
 COPY ${WAR_FILE} /usr/local/tomcat/webapps/app.war
 
 
 MAINTAINER "mavurubhaskar@gmail.com"
