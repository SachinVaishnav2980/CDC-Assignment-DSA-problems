package Recursion1;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    //Using recursion.
    static int factorial(int n) {
        // code here
        if(n==0 || n==1){
            return 1;
        }
        
        return n*factorial(n-1);
    }
}
