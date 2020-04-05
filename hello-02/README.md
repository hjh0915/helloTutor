hello-02
========
Hello02.java
用文件、包等分离

> javac Hello02.java

> javac Utils.java

> java -cp . Hello02

JUnit的用法
===========
用单元测试进行测试，以体现分离的好处
使用classpath加载其他的包，这里至关重要，分离的好处也在于此，可以被其他的程序使用，只要测试完整。

下载
====
下载链接

https://github.com/junit-team/junit4/wiki/Download-and-Install

https://search.maven.org/search?q=g:junit%20AND%20a:junit

https://search.maven.org/search?q=g:org.hamcrest%20AND%20a:hamcrest-core&core=gav

版本选择
junit-4.12.jar, hamcrest-core-1.3.jar

编译运行
========
> javac -classpath $JUNIT_HOME/junit-4.12.jar:$JUNIT_HOME/hamcrest-core-1.3.jar:. Utils.java TestUtils.java TestRunner.java

> java -classpath $JUNIT_HOME/junit-4.12.jar:$JUNIT_HOME/hamcrest-core-1.3.jar:. TestRunner
