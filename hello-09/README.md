下载gradle 5.2.1

> cd hello-09

初始化项目
==========
> gradle init --type java-application

```
Select build script DSL:
  1: groovy
  2: kotlin
Enter selection (default: groovy) [1..2] 1

Select test framework:
  1: junit
  2: testng
  3: spock
Enter selection (default: junit) [1..3] 1

Project name (default: hello-09): Hello09
Source package (default: Hello09): 

BUILD SUCCESSFUL in 22s
2 actionable tasks: 2 executed
```

构建命令
========
> gradle build

修改App.java
============
```java
package Hello09;
import com.mine.hello.*;

public class App {
    public static void main(String[] args) {
        System.out.println(Utils.add(2, 3));
    }
}
```

修改AppTest.java
================
```java
package Hello09;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mine.hello.*;

public class AppTest {
    @Test public void testAdd() {	
      assertEquals(5, Utils.add(2, 3));
    }
}
```

运行
====

> gradle run
```
> Task :run
5

BUILD SUCCESSFUL in 0s
2 actionable tasks: 1 executed, 1 up-to-date
```

打包设置
========
build.gradle

```groovy
jar {
    manifest {
        attributes('Implementation-Title': project.name,
                   'Implementation-Version': project.version,
                   'Main-Class': 'Hello09.App')
    }
}

// Define the main class for the application
mainClassName = 'Hello09.App'
version = '0.1.0'
```

参看之前的manifest.txt中内容

> 'Main-Class': 'Hello09.App'

> gradle jar

运行
====
> java -jar build/libs/Hello09-0.1.0.jar
