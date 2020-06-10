package InterfaceAndAbstract;

public class PrinterClass extends AbstractClass {

    public void print(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] arg){

        PrinterClass printer = new PrinterClass();
        System.out.printf("the result of function toString:%s\n", printer.toString());
        System.out.print("the result of function print:");
        printer.print("caochong");
    }

}

abstract class AbstractClass{

    public String toString(){
        return "use this to print documents";
    }

    public abstract void print(Object obj);

}
