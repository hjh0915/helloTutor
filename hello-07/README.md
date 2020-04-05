练习目标
========
打包成可执行的jar包

> jar cvf jars/libs/utils.jar -C classes com/mine/hello/Utils.class

> javac -d ./classes -classpath jars/libs/utils.jar:. ./src/Hello07.java

manifest.txt
============
```
Main-Class: Hello07 
Class-Path: libs/utils.jar
```

文件的冒号后面必须要空一个空格，否则会出错
文件的最后一行必须是一个回车换行符，否则也会出错

打包
====
+ -m  包含指定清单文件中的清单信息
+ -c  创建新档案
+ -v  在标准输出中生成详细输出
+ -f  指定档案文件名

> jar cvfm jars/Hello07.jar manifest.txt -C classes Hello07.class

libs/utils.jar与Hello07.jar的目录位置
=====================================
> java -jar jars/Hello07.jar
