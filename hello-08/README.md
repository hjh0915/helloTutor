练习目标
========
打包成可执行的jar包，形成一个完整的jar包，不分离出utils.jar

> javac -d ./classes ./src/com/mine/hello/Utils.java

> javac -d ./classes -classpath ./classes:. ./src/Hello08.java

manifest.txt
============

> Main-Class: Hello08 

打包
====
> jar cvfm jars/Hello08.jar manifest.txt -C classes/ .

运行
====
> java -jar jars/Hello08.jar
