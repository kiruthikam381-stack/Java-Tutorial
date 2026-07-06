package day13;


import java.util.*;
public class arraylist2 {
    public static void main(String[]args){
            List<String> list=new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("mango");
            list.remove("Apple");
            list.addFirst("Orange");
            List<String>name=Arrays.asList("nnnn","eeeee");
            list.addAll(3,name);
            System.out.println(list);
        }
    }

