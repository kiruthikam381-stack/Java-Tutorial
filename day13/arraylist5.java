package day13;

import java.util.*;
public class arraylist5 {
    public static void main(String[]args){
        List<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("C");
        list.add("D");
        list.add("E");
        list.addFirst("Orange");
        System.out.println(list);
        list.addLast("Anjali");
        System.out.println(list);
        List<String>name=Arrays.asList("keerthi","kalpana");
        list.addAll(2,name);
        System.out.println(list);
        list.remove("anjali");
        list.remove("Banana");
        list.remove("Apple");
        System.out.println(list);
        List<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list2.removeIf(n->n%2==0);
        System.out.println(list2);
        list2.clear();
    }
}
