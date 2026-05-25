// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    int sum_of_n(int n){
        if(n==0||n==1){
            return n;
        }
        return n+sum_of_n(n-1);
    }
    public static void main(String[] args) {
       Main m=new Main();
       int res=m.sum_of_n(10);
       System.out.println(res);
    }
}