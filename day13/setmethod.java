package day13;

import java.util.*;
public class setmethod {
    public static void main(String[]args){
        List<String>list=new ArrayList<>(Arrays.asList("A","B","C","D"));
        list.set(1,"bb");
        list.add(2,"B");
        //System.out.println(list);
       // list.replaceAll(s-> s.toUpperCase());
        //list.replaceAll(s-> s.toLowerCase());
        Collections.reverse(list);
        System.out.println(list);
    }
}
