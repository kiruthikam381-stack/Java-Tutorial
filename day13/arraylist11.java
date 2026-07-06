package day13;

import java.util.*;
public class arraylist11 {
    public static void main(String[]args){
        List<String>list=new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("mango");
        list.remove("Apple");
        list.addFirst("Orange");
        System.out.println(list);
    }
}
