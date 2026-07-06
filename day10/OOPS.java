package day10;
class calcultor{
    int a;
    int b;
    public calcultor(int a,int b){
        this.a=a;
        this.b=b;
    }
            public void add(){
        int add=a+b;
        System.out.println("add");
    }
    public void sub(){
        int sub=a-b;
        System.out.println("sub");
    }
}
public class OOPS {
    public static void main(String[]args){
        calcultor call1=new calcultor(10,20);
        call1.add();
        call1.sub();
    }
}
