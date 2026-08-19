public class VowelCount{
    public static void main(String[] args) {
        
        String word = "Hello";
        
        for(int index = 0; index < word.length(); index++) {
            if(word.charAt(index) == 'a' || word.charAt(index) == 'e' || word.charAt(index) == 'i' || word.charAt(index) == 'o' || word.charAt(index) == 'u'){
                System.out.println(index);
                break;
            }
        }
    }
}
