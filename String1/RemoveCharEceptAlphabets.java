package String1;

public class RemoveCharEceptAlphabets {
    public static void main(String[] args) {
        String s="abcdfubf rf8788434u3knl@.;:";
        String ans=solve(s);
        System.out.println(ans);
    }

    static String solve(String s){
        StringBuilder ans=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                continue;
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
