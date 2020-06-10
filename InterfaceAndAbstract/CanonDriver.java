package InterfaceAndAbstract;

import java.util.Scanner;

public class CanonDriver implements Printable {

    public void print(Object str){
        System.out.println("your input is:"+str);
    }

    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);
        System.out.print("please input:");
        String input = in.next();

        CanonDriver can = new CanonDriver();
        can.print(input);
    }
}
