# 文件和目录的操作

## 1.创建和删除

```$xslt
Path path1 = Paths.get("D:\\github_project\\Java\\java_code_guide\\nihao.txt");
Files.delete(path1);
Path newFile = Files.createFile(path1);

Path path2 = Path.of("D:\\github_project\\Java\\java_code_guide\\nihao");
Files.delete(path2);
Path newDiretory = Files.createDirectory(path2);
```

## 2.检索

```$xslt
Path path1 = Paths.get("D:\\github_project\\Java\\java_code_guide");

try(DirectoryStream<Path> chilren = Files.newDirectoryStream(path1)){
    for(Path child : chilren){
        System.out.println(child);
    }
}
catch(IOException e){
    e.printStackTrace();
}
```

## 3.复制和移动

```$xslt
Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
```

## 4.文件的读写

```$xslt
Charset charset = Charset.forName("US-ASCII");
Files.write(path1, lst, charset);
List<String> writedText = Files.readAllLines(path1, charset);
```

## 5.输入/输出流

```$xslt
Path path1 = Paths.get("D:\\github_project\\Java\\java_code_guide\\text.txt");
InputStream inputStream1 = Files.newInputStream(path1,StandardOpenOption.READ);
it1 = inputStream1.read();


Path path3 = Paths.get("D:\\github_project\\Java\\java_code_guide\\writedTest.txt");
OutputStream outputStream = Files.newOutputStream(path3, StandardOpenOption.CREATE)
byte[] readDate = new byte[1024];
outputStream.write(readDate, 0, i);

读取的字节为0-255范围的byte类型的整数
```

## 6.序列化和反序列化

将类对象，或者基本数据类型转成字节码以字节流的形式，序列化地写入文件中
或者从存储有类的序列化字节码文件中，读取对象，并且反序列化为对象，注意不是类，而是实例化
的对象，带有信息。

```$xslt
    // 写入
    Path path = Paths.get("D:\\github_project\\Java\\java_code_guide\\text.txt");
    Customer customer = new Customer(1, "caochong");
    OutputStream outputStream = Files.newOutputStream(path, StandardOpenOption.WRITE);
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
    objectOutputStream.writeObject(customer);

    // 读取
    InputStream inputStrea = Files.newInputStream(path, StandardOpenOption.READ);
    ObjectInput objectInput = new ObjectInputStream(inputStrea);
    Customer cc = (Customer) objectInput.readObject();

```
