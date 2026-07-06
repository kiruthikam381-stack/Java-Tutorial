package day7;


import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int target=5;
        System.out.println(binarysearch(arr,target));
    }
    static int binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static class Reverse_word_in_string {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine();
            char[] arr=name.toCharArray();
            int start=0;
            int end=arr.length-1;
            while(start<end){
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=arr[temp];
                start++;
                end--;
            }
            String name1=new String(arr);
            System.out.println(name1);
        }

    }
}