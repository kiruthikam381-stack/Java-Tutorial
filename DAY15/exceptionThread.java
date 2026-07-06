package DAY15;


class a extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
class b extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
public class exceptionThread {
    public static void main(String[] args){
        a A=new a();
        b B=new b();
        A.start();
        B.start();
    }
}