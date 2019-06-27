练习目标
========
1.把编译的class单独存放到classes目录下
2.把jar包单独存放到libs目录下
3.把源代码独立放到src下，完全和class文件分离

javac -d ./classes src/com/mine/hello/Utils.java
把class文件放到classes目录下

jar cvf libs/utils.jar -C classes com/mine/hello/Utils.class
生成libs目录下utils.jar

javac -d ./classes -classpath libs/utils.jar:. ./src/Hello05.java

java -classpath utils.jar:./classes:. Hello05 或 java -classpath utils.jar:./classes Hello05
