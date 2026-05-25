// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    int pow(int n,int m){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(m==1){
            return n;
        }else if(m==0){
           return 1; 
        }
        return n*pow(n,m-1);
    }
    public static void main(String[] args) {
       Main m=new Main();
       int res=m.pow(2,5);
       System.out.println(res);
    }
}