package day10;


    class A{
        A(){
            System.out.println("A");
        }
        A(int a){
            System.out.println("A is b");
        }
    }
    class b extends A{
        b(){
            super(5);
            System.out.println("B");
        }
        b(int b){
            this();
            System.out.println("B is A");
        }
    }
    public class main{
        public static void main(String[]args){
            b b=new b(5);
        }
}

