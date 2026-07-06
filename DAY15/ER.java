package DAY15;

import java.util.MissingFormatArgumentException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ER{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String name="";
        int id=0;
        int[] age={};
        try{
            name=input.nextLine();
            id=input.nextInt();
            System.out.println(age[10]);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        catch(MissingFormatArgumentException e){
            System.out.println(e);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}