异常
==

# 概念
异常可以分成`非检查性异常`和`检查性异常`。派生于Error类或者
`untimeException类的所有异常为**非检查性异**，我的理解是
由系统和编译器负责检查的底层异常。其他的所有异常为**检查性异常**

在我们编写的代码中，不允许出现异常时，程序不能捕捉的情况，因为这样
会让程序不受掌控，出现非期望的结果。

# 用法

## 1. 声明检查性异常

```
在类方法后面使用`throws`关键字声明可能发生异常
public FileInputStream(String name) throws FileNotFoundException
```

## 2. 抛出异常

主要包括两个内容，第一在方法名后声明检查性异常，第二，在函数
体内使用使用`throw new 异常类`主动抛出异常。

```aidl
public static void main(String[] args)  throws IOException
{
// 路径对象
Path path = Path.of("./myfile.txt");

if(true)
    throw new FileNotFoundException();   // 主动抛出检查类异常对象
// 扫描器
Scanner in = new Scanner(path, StandardCharsets.UTF_8);
String str = in.nextLine();
System.out.println(str);
}
```

## 3. 捕捉异常



