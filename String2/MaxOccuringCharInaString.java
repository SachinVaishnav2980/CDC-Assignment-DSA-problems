package String2;

public class MaxOccuringCharInaString {
    public static void main(String[] args) {
        String s = "samplestring";
        System.out.println(getMaxOccurringChar(s));
    }

    public static char getMaxOccurringChar(String s) {
        int []freq=new int[26];
        int max=Integer.MIN_VALUE;
        //make freq array and max freq
        for(int i=0;i<s.length();i++){
            freq[i-'a']++;
            max=Math.max(max, freq[i-'a']);
        }

        //Now return the first most char of max freq
        char ch=' ';
        for(int i=0;i<26;i++){
            if(freq[i]==max){
                ch=(char)(i+'a');
                break;
            }
        }
        return ch;
    }
}
