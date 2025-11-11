package String2;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {

    }

    String removeDups(String s) {
        //Store frequencies
        int []freq=new int [26];
        StringBuilder str=new StringBuilder();
    
        //update freq and add the new char of string
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==0){
                str.append(ch);
            }
            freq[ch-'a']++;
        }
        return str.toString();
    }
}
