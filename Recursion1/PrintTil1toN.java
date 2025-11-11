package Recursion1;

public class PrintTil1toN {
    public static void main(String[] args) {
        
    }

    static void printTillN(int N) {
        // code here
        if(N==0) return ;
        
        printTillN(N-1);
        System.out.print(N+" ");
    }
}
