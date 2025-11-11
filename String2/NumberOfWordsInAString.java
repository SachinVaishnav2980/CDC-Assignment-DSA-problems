package String2;

public class NumberOfWordsInAString {

    public static void main(String[] args) {
        String s="";
        System.out.println(calc(s));
    }

    //Each word is surrounded by spaces which means words are more than spaces by 1

    static int calc(String s){
        int noOfSpaces=0;

        for(char ch:s.toCharArray()){
            if(ch==' '){
                noOfSpaces++;
            }
        }
        return noOfSpaces+1;
    }
}