package collection;

import java.util.*;

public class listArrayListTest {

    public static void main(String[] arg){

        // 列表
        List<String> lst = new ArrayList<>();

        lst.add("cao");
        lst.add("chong");        // 增
        lst.add("is");
        lst.add("studying");
        lst.add("carefully");
        lst.add("!!!");
        lst.remove(lst.size()-1);     // 删

        String res =lst.get(lst.size()-1);  // 查
        int index = lst.indexOf("cao");
        System.out.printf("the index of 'cao' is %d\n", index);

        lst.set(0, "zhang");     // 改

        // 迭代list
        Iterator iter = lst.iterator();
        while(iter.hasNext()){
            String ress = (String) iter.next();
            System.out.println(ress);
        }

        // 集合
        Set set = new HashSet();
        set.add("caochong");
        if (!set.add("caochong")){
            System.out.println("addition failed!");
        }

        // 队列
        Queue queue = new LinkedList();
        queue.offer(2);
        queue.peek();
        System.out.println(queue.poll());


    }


}
