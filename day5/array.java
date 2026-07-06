package day5;

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }
    }

    public static class array2 {
        public static void main(String[]args){
            int[]array=new int[]{7,1,2,4,5};
            int sum=0;
            float avg;
            for(int num:array) {
                sum += num;
            }
            avg=sum/array.length;
            System.out.println(sum);
            System.out.println(avg);

        }
    }
}
