#log4j-elastic-search-example
============================

One-jar application that logs events in elastic search using the log4j elastic search appender

##Usage:



###1) Run logstash or elastic search in your local machine 

`logstash agent -f ../myConf.conf`

(See http://logstash.net/docs/1.4.2/tutorials/getting-started-with-logstash)

Check service is running and indexes are created in http://localhost:9200/_stats 


###2) Compilation

`mvn clean install`

`cd target`

###3) Print some log using log4j

`java -jar test-0.0.1-SNAPSHOT.one-jar.jar`

###4) Run Kibana and check for the log indexed

`cd <kibanaFolder>`

`python -m SimpleHTTPServer`

Open http://localhost:8000/ in a browser

