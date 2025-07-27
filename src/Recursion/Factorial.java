package Recursion;

public class Factorial {
     static int factorial(int n ){
         if(n==0)
             return 1;
         int fact = n * factorial(n-1);

         return fact;
     }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(factorial(n));


    }
}
