// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    int mul(int n,int m){
        if(n==0||m==0){
            return 0;
        }else if(n==1){
            return m;
        }else if(m==1){
            return n;
        }
        return n+mul(n,m-1);
    }
    public static void main(String[] args) {
       Main m=new Main();
       int res=m.mul(2,5);
       System.out.println(res);
    }
}