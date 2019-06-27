练习目标
========
把运算部分单独生成jar包

cd hello04/com/mine/hello
javac Utils.java

jar cvf utils.jar com/mine/hello/*.class
生成utils.jar

javac -classpath utils.jar:. Hello04.java

java -classpath utils.jar:. Hello04
