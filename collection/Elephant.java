package collection;

import java.util.Arrays;

public class Elephant implements Comparable {

    public float weight;
    public int age;
    public int compareTo(Object obj){

        Elephant elephant = (Elephant) obj;
        if(this.weight>elephant.weight)
            return 1;
        else if(this.weight<elephant.weight)
            return -1;
        else{
            return this.age-elephant.age;
        }


    }

    public static void main(String[] args){

        Elephant e1 = new Elephant();
        e1.weight = 10.1f;
        e1.age = 1;
        Elephant e2 = new Elephant();
        e2.weight = 11.2f;
        e2.age  =2;
        Elephant e3 = new Elephant();
        e3.weight = 10.1f;
        e3.age = 3;

        Elephant[] elephants  = new Elephant[3];
        elephants[0] = e1;
        elephants[1] = e2;
        elephants[2] = e3;

        // 使用elephants实现了的compareTo方法
        Arrays.sort(elephants);

        for(int i=0; i<elephants.length; i++){
            System.out.printf("no.%d, weight:%f, age:%d\n", i, elephants[i].weight, elephants[i].age);
        }

        // 使用AgeComparator比较器的方法，排序
        Arrays.sort(elephants, new AgeComparator());

        for(int i=0; i<elephants.length; i++){
            System.out.printf("no.%d, weight:%f, age:%d\n", i, elephants[i].weight, elephants[i].age);
        }

    }
}
