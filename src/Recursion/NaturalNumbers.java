package Recursion;

public class NaturalNumbers {

    // write a program to print n to 1 natural numbers using recursion

    static void decresingNumbers(int n){
        if(n==0)
            return;
        System.out.println(n);
         decresingNumbers(n-1);
    }

    // given  an integer find out the sum of its digits using recursion  if n = 23453 so answer will be 17

    static int sumOfDigits(int n ){

        // base case will be
        if(n >= 0 && n <=9)
            return n;

        return sumOfDigits(n/10) + n%10;


    }

    // return the count of the digits if n = 1234 so count will be 4


    static int countDigits(int n ){
        if (n==0)
            return 0;

        return 1+ countDigits(n/10);
    }

    // given an numbers num and value k print k multiple of num  if num =  12 and k = 3 so answer will be 12,24 , 36

    static void numMultiplyByK(int num,int k){

        if(k == 1){
            System.out.println(num);
            return;
        }
        numMultiplyByK(num, k-1);
        System.out.println(num*k);

    }

    // given numbers n find the sum of n naturral numbers with alternative sign
    // n = 4  1-2+3-4

     static int seriesSum(int n){

        if(n == 0)
            return 0;
        if(n%2==0)
            return  seriesSum(n-1)-n;
        else
            return seriesSum(n-1)+n;
     }


     // find the gcd of two numbers x, y
    // euclids algoritham say gcd of x,y = gcd of (y, x%y)

    static int gcd (int x, int y){

        if(y==0)
            return x;

        return gcd(y,x%y);
    }



    public static void main(String[] args) {

        int n = 5;
        // 5,4,3,2,1

       // decresingNumbers(n);

       // System.out.println(sumOfDigits(12345));

        //System.out.println(countDigits(234532));

        //numMultiplyByK(5,4);

        //System.out.println(seriesSum(5));

        System.out.println(gcd(24,24));




    }
}
