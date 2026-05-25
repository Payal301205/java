// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d1=n%10;
        n=n/10;
        int d2=n%10;
        n=n/10;
        int d3=n%10;
        int rev=d1*100+d2*10+d3;
        System.out.println(rev);
    }
}