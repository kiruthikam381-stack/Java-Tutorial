package DAY15;



class k extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
class s extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
public class threads{
    public static void main(String[] args){
        k K=new k();
        s S=new s();
        K.setPriority(10);
        K.start();
        S.start();
    }
}
