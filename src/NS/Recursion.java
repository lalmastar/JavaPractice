package NS;

public class Recursion {
    static void trip(String[] location, int destination){
        if(destination==5)
            return;
        System.out.println(location[destination]);
        trip(location,destination+1);
    }
    static int fib(int n){
        if(n<2)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        String[] location={"Bangalore","Mysore","Hubli","Dharwad","Belgaum"};
        int n=7;
        trip(location,0);
        System.out.println(fib(n));
    }
}
