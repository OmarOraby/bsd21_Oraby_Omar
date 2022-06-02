 ##why are logging libraries used?
When developing algorithms, a large amount of information must be output in order to be able to trace the process. Often in large software projects one inserts a standard output (see illustration), which writes out the interesting parameters. To make this step more effective, ready-made libraries such as glog or log4cxx already exist. 

##What are the log levels in Log4J and what are they about?
Log4j is a framework for logging application messages in Java. Within many open source and commercial software products, it has become a de facto standard over the years. Log4j is considered a forerunner for other logging frameworks, even in other programming languages.
###ALL
###DEBUG
###INFO
###WARN
###ERROR
###FATAL
###TRACE
Quelle: https://www.tutorialspoint.com/log4j/log4j_logging_levels.htm

##What kind of configuration options does log4J offer?
Log4j has the ability to automatically configure itself during initialization. When Log4j starts, it finds all ConfigurationFactory plugins and ranks them in weighted order from highest to lowest.