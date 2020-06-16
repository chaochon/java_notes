package nio;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class file {

    public static void main(String[] args) throws IOException, ClassNotFoundException{

        Path path = Paths.get("D:\\github_project\\Java\\java_code_guide\\text.txt");
        Customer customer = new Customer(1, "caochong");

        try(OutputStream outputStream = Files.newOutputStream(path, StandardOpenOption.WRITE);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        ) {
            objectOutputStream.writeObject(customer);
            objectOutputStream.writeObject("ni hao");
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try(InputStream inputStrea = Files.newInputStream(path, StandardOpenOption.READ);
        ObjectInput objectInput = new ObjectInputStream(inputStrea);)
        {
            Customer cc = (Customer) objectInput.readObject();
            System.out.printf("No.%d, name=%s\n", cc.id, cc.name);

            String ss = (String) objectInput.readObject();
            System.out.println(ss);


        }
        catch(IOException e){
            e.printStackTrace();
        }


    }


}

class Customer implements Serializable {

    public int id;
    public String name;
    public Customer(int id, String name){
        this.id = id;
        this.name = name;
    }
}
