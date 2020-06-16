package collection;

import java.util.Comparator;

public class AgeComparator implements Comparator {

    public int compare(Object obj1, Object obj2){

        Elephant e1 = (Elephant) obj1;
        Elephant e2 = (Elephant) obj2;

        return e1.age - e2.age;
    }
}
