#Description
This is a tomcat 8 server config for Directions web project to be used for loal running of the Directions project

#Configuration
The following files and folders are expected to exist:


#Usage
Create a new server in your workspace via File -> New -> Other ... ->Server_.  After creating the server, double click on it in your servers view and change the _configuration path_ to point to _/DirectionsServer-config_.  Be sure to clean the server.  You can also delet the config inside your /Servers/<yourServerName> since it will no longer be used at this point.  

Runtime parameters that are expected:
<pre>
-Djava.library.path=${workspace loc}; C:\tomcat\tomcat8dev\x64;
</pre>

#Logging
Logs will be written to:
C:\Applogs\DirectionsWeb