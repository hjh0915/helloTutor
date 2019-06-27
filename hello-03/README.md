练习目标
========
生成java包package

cd hello03
javac -d . com/mine/hello/Utils.java
-d <目录>  指定放置生成的类文件的位置
生成的Utils.class放在当前目录下，并按照package的方式来存放
package com.mine.hello

cd hello03
javac -classpath . Hello03.java  或  javac Hello03.java

java -classpath . Hello03  或  java Hello03
