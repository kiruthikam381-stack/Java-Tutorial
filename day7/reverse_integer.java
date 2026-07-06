package day7;

public class reverse_integer {
    public static void main(String[]args){
        int[]arr={'h','e','l','l','o'};
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=0;j--){
                int temp=arr[j];
                arr[i]=arr[j];
            }
        }
    }
}
