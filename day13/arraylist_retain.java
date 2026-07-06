package day13;

import java.util.*;
public class arraylist_retain {
    public static void main(String[]args){
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        //list.remove(0);
        //list.remove("B");
        //List<String>name=Arrays.asList("C","D");
        //list.removeAll(name);
        //System.out.println(list);
        List<Integer>list2= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list2.removeIf(n->n%2==0);
        System.out.println(list2);
    }
}
