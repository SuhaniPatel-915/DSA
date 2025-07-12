import java.util.HashSet;

public class lenOfLongSubStr2 {
    public static int  lengthOfLongestSubstring(String s) {
        int maxlen=0;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)){
                maxlen=Math.max(maxlen,set.size());
                set.clear();
                    i--;
            }
            else{
                set.add(ch);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s="abcabccb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}