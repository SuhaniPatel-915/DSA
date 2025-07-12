public class String_1 {
    public static void main(String[] args) {
        // String str="hello";
        // char[] data=str.toCharArray();
        // for(char i=0;i<data.length;i++){
        //        System.out.println(data[i]);
        // }  
        // for(int i=0;i<str.length();i++){
        //     System.out.println(str.charAt(i));
        // }
        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.println(str.charAt(i));
        // }
        String str="helloo";
        String result="";
        for(char i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(result.indexOf(ch)==-1){
                result+=ch;
            }
        }
        System.out.println(result);


    }
}
