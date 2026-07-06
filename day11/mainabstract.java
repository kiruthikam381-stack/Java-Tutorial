package day11;

abstract class ER{
    abstract void run();
    abstract void display();
    void display2(){
        System.out.println("Eeeeee");
    }
}
class EE extends ER{
    void run(){
        System.out.println("hello world");
    }
    void display(){
        System.out.println("Aagayam");
    }
}
public class mainabstract {
    public static void main(String[]args){
        EE a=new EE();
        a.run();
        a.display();
    }
}
