package Recursion1;

public class CountDigit {
    public static void main(String[] args) {
        int n=43;
        System.out.println(evenlyDivides(n));
    }

    static int evenlyDivides(int n) {
        int num=n;
        return count(n, num);
    }
    
    static int count(int n, int num){
        if(n==0){
            return 0;
        }
        
        int digit=n%10;
        if(digit!=0 && num%digit==0){
            return 1+count(n/10, num);
        }
        return 0+count(n/10, num);
    }
}
