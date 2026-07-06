package day11;

class animal {
    void makesound() {
        System.out.println("makesound");
    }

    void issleep() {

    }
}

class dog extends animal{
    String name;
    dog(String name){
        this.name=name;
    }
    void bark(){
        System.out.println(name+"  Barking");
    }
    void issleep(){
        System.out.println(name+"sleeping");
    }
}
class cat extends animal{
    String name;
    cat(String name){
        this.name=name;
    }
    void meow(){
        System.out.println(name+" meowing");
    }
    void issleep(){
        System.out.println(name+" sleeping");
    }
}


public class main3 {
    public static void main(String[] args){
        dog d=new dog("Jack");
        cat c=new cat("kalki");
        d.bark();
        d.issleep();
        c.meow();
        c.issleep();
    }
}