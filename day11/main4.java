package day11;

class ex{
    void display(){
        System.out.println("display the outer class A");
    }
    class a{
        void display(){
            System.out.println("display");
        }
    }
}
public class main4 {
    public static void main(String[]args){
        ex obj=new ex();
        ex.a obj2=obj.new a();
        obj2.display();
    }
}
