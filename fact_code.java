// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
       Main m=new Main();
       int res=m.fact(5);
       System.out.println(res);
    }
}