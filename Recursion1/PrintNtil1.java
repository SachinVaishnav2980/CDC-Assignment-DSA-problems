package Recursion1;

public class PrintNtil1 {
    public static void main(String[] args) {

    }

    static void printTillN(int N) {
        // code here
        if(N==0) return ;
        System.out.print(N+" ");
        printTillN(N-1);
    }
}
