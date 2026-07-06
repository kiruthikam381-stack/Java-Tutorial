package DAY15;

import java.util.Scanner;
public class exception {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=0;
        try{
            n=input.nextInt();
        }catch(Exception e){
            System.out.println("Invalid input");
        }
        System.out.println(n);
    }
}





