练习目标
========
把测试源代码独立放到tests下，并把编译后的class文件放到classes/tests目录下

> javac -d ./classes src/com/mine/hello/Utils.java

把class文件放到classes目录下

> jar cvf libs/utils.jar -C classes com/mine/hello/Utils.class

生成libs目录下utils.jar

> javac -d ./classes/tests -classpath $JUNIT_HOME/junit-4.12.jar:$JUNIT_HOME/hamcrest-core-1.3.jar:./libs/utils.jar:. tests/TestUtils.java tests/TestRunner.java

运行测试代码
============

测试方式1
---------

> java -classpath $JUNIT_HOME/junit-4.12.jar:$JUNIT_HOME/hamcrest-core-1.3.jar:./libs/utils.jar:./classes/tests:. TestRunner

测试方式2
---------

> java -classpath $JUNIT_HOME/junit-4.12.jar:$JUNIT_HOME/hamcrest-core-1.3.jar:./libs/utils.jar:./classes/tests:. junit.textui.TestRunner TestUtils

测试方式3
---------

> java -classpath $JUNIT_HOME/junit-4.12.jar:$JUNIT_HOME/hamcrest-core-1.3.jar:./libs/utils.jar:./classes/tests:. org.junit.runner.JUnitCore TestUtils

运行程序
========
> javac -d ./classes -classpath libs/utils.jar:. ./src/Hello06.java

> java -classpath utils.jar:./classes Hello06
