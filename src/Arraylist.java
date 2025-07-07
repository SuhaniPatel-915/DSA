// import java.util.ArrayList;
// import java.util.Collections;
import java.util.HashMap;
// import java.util.HashSet;
// import java.util.TreeSet;

public class Arraylist {
    public static void main(String[] args) {
        // ArrayList<Integer>arr=new ArrayList<>();//10
        // arr.add(5);
        // arr.add(6);
        // arr.add(7);
        // arr.add(2, 11);
        // arr.set(2, 12);
        // for(int var:arr){
        //     System.out.println(var);
        // }
        // for(int i=0;i<arr.size();i++){
        //     System.out.println(arr.get(i));
        // }
        // Collections.sort(arr);
        // int odd=0;
        // int even=0;
        // for(int var : arr){
        //     if(var%2==0){

        //     }
        // }
        // HashSet<String> set=new HashSet<>();
        // TreeSet<Integer>data=new TreeSet<>();
        // data.add(10);
        // data.add(23);
        // data.add(2);
        // System.out.println(data);
        // // data.add(1,4);
        // set.add("hello");
        // set.add("hello");
        // set.add("hii");
        // set.remove("hello");
    
        // System.out.println(set);
        HashMap<String,Integer>map =new HashMap<>();
        map.put("one", 1);
        map.put("two", 1);
        map.put("three", 3);
        System.out.println(map);
        // System.out.println(map.get("three"));
        System.out.println(map.getOrDefault("hello", 0));
    }
}
