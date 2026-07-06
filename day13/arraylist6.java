package day13;

import java.util.*;

public class arraylist6 {
    public static void main(String[]args){
        List<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("C");
        list.add("D");
        list.add("E");
        list.remove(0);
        list.remove("B");
        List<String>name=Arrays.asList("C","D");
        list.removeAll(name);
        System.out.println(list);
    }
}
