package day11;

class a {
     void display(){
         System.out.println("display");
     }
}
class B extends a {
    void display() {
        System.out.println("hello");
    }
}
public class main2 {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
