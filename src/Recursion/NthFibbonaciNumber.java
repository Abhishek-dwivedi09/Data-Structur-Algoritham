package Recursion;

public class NthFibbonaciNumber {
    static int fibbonaci(int n ){
        if(n ==0 || n==1 ) return n;
        int fibb = fibbonaci(n-1) + fibbonaci(n-2);
        return fibb;

    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibbonaci(n));
    }
}
