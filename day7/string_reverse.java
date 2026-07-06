package day7;

public class string_reverse {
    public static void main(String[] args){
        String name="Hello World";
        char[] arr=name.toCharArray();
        int start=0,end=arr.length-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        String name1=new String(arr);
        System.out.println(name1);
    }
}

