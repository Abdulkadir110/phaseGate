public class UpperCaseCount {
    
    public static void main(String[] args) {
        
        String word = "Hello";
        int upperCaseCount = 0;
        char[] wordArray = word.toCharArray();
        
        for (char letter : wordArray) {
            if(letter.isUpper){
                upperCaseCount++;
            }
        }
       
        System.out.println(upperCaseCount);
    }
}
