hello-00
========
Hello.java
用方法分离

> javac Hello.java

> java -cp . Hello

> $ javap Hello.class
```
Compiled from "Hello.java"
public class Hello {
  public Hello();
  public static void main(java.lang.String[]);
  public static int add(int, int);
}
```
默认的构造方法：Hello()

另说
===
点到为止，因为这些不是这个入门的重点

HelloWorld.java

https://www.w3cschool.cn/java/java-object-class.html

java 对象，默认的方法有 九个
重写一个方法: toString()
动态构建一个实例