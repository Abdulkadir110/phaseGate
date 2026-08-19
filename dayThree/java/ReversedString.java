public class ReversedString {
    
    public static void main(String[] args) {
        
        String word = "Hello";
        
        for(int index = word.length() - 1; index >=0; index--){
            char letter = word.charAt(index);
            System.out.print(letter);
        }
        
        
    }
}
