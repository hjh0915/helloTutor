练习目标
========
从gradle构建的项目架构出发来实践

目录结构保持一致

src/main/java/Hello10/com/mine/hello/Utils.java

src/main/java/Hello10/App.java

创建编译结果存放目录

> mkdir -p ./build/classes/java/main

编译

> javac -d ./build/classes/java/main ./src/main/java/Hello10/com/mine/hello/Utils.java
> javac -d ./build/classes/java/main -classpath ./build/classes/java/main:. ./src/main/java/Hello10/App.java

运行

> java -classpath ./build/classes/java/main:. Hello10/App

测试
====
> mkdir -p ./build/classes/java/test

> javac -d ./build/classes/java/test -classpath $JUNIT_HOME/junit-4.12.jar:$JUNIT_HOME/hamcrest-core-1.3.jar:./build/classes/java/main:. ./src/test/java/Hello10/AppTest.java

> java -classpath $JUNIT_HOME/junit-4.12.jar:$JUNIT_HOME/hamcrest-core-1.3.jar:./build/classes/java/main:./build/classes/java/test:. junit.textui.TestRunner Hello10.AppTest

jar包
=====
manifest.txt放到src/main/resources目录下
内容如下: 

> Main-Class: Hello10.App

> mkdir -p ./build/libs

> jar cvfm ./build/libs/Hello10-0.1.0.jar ./src/main/resources/manifest.txt -C ./build/classes/java/main .

执行jar包
=========
> java -jar build/libs/Hello10-0.1.0.jar
