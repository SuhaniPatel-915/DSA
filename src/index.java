import java.util.HashMap;
import java.util.Map;
public class index {
    public static void main(String[] args) {
        String input="hello";
        Map<Character,Integer>map = new HashMap<>();
        for(char ch:input.toCharArray()){
            if(ch!=' '){
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
        }
        System.out.println(map);
    }
}
//[1,2,3,5,6]
//[2,3,5,6,1]
