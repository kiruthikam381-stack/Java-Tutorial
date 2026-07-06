package day10;

    import java.util.Scanner;
    class car{
        int a;
        int b;
        public void add(){
            int a=10;
            int b=50;
            System.out.println(a+b);
        }
    }
    public class car2004 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            car c1=new car();
            c1.a=sc.nextInt();
            c1.b=sc.nextInt();
            c1.add();
        }
}
