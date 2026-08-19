public class ReversedString {
    
    public static void main(String[] args) {
        
        String word = "Hello";
        String reverse = "";
        char[] wordArray = word.toCharArray();
        
        for(int index = wordArray.length - 1; index >=0; index--){
            reverse += wordArray[index];
        }
        
        System.out.println(reverse);
    }
}
