package String1;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String  str="Take u forward is Awesome";
        int vowel=0;
        int consonants=0;
        int whiteSpaces=0;
        solve(str, vowel, consonants, whiteSpaces);
        System.out.println(vowel);
        System.out.println(consonants);
        System.out.println(whiteSpaces);
    }

    static void solve(String str, int vowel, int consonants, int whiteSpaces){
        String s=str.toLowerCase();
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel++;
            }else if(ch>='a' && ch<='z'){
                consonants++;
            }else{
                whiteSpaces++;
            }
        }   
    }



}
