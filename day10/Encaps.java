package day10;

class Book {
    private int a;
    private int b;

    public int getA(int a) {
        return a;
    }
    public int getB(int b) {
        return b;
    }
    public int setA(int a) {
        if (a > 10) {
            this.a = a;
        }
        else {
            System.out.println("invalid input");
        }
        return 0;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void display() {
        System.out.println(a + " " + b);
    }
}
    public class Encaps {
        public static void main(String[] args) {
            Book a1 = new Book();
            a1.setA(10);
            a1.setB(20);
            a1.display();
        }
    }



