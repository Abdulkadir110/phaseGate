public class AsciiValues {
    public static void main(String[] args) {
        String word = "Hello";
        int asciiValue = 0;
        
        for (int index = 0; index < word.length(); index++) {
           asciiValue = word.charAt(index);
           System.out.println(asciiValue);
        }
        
    }
 }
