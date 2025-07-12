import java.util.HashSet;

public class lenOfLongSubStr {
    public static int lenOfLongSubStr(String s){
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(set.contains(ch)){
                    break;
                }
                else{
                    set.add(ch);
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
       return maxlen;
    }
    public static void main(String[] args) {
        String s="abcabccb";
        System.out.println(lenOfLongSubStr(s));
    }
}
