public class AsciiValues {
    public static void main(String[] args) {
        String word = "Hello";
        char[] wordArray = word.toCharArray();
        for (char letter : wordArray) {
          System.out.println(letter + " " + ord(letter));
        }
    }
 }
