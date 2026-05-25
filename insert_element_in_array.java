// Online Java Compiler
// Use this editor to write, compile and run your Java code 
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("enter key");
         int key=sc.nextInt();
          System.out.println("enter loaction");
          int loc=sc.nextInt();
          int j=n-1;
        while(j>=loc){
            arr[j+1]=arr[j];
            j--;
        }
        arr[loc]=key;
        
        for(int i=0;i<=n;i++){
           System.out.print(arr[i]+" ");
        }
    }
}