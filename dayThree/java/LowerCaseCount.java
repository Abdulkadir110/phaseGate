public class LowerCaseCount {
    
    public static void main(String[] args) {
        
        String word = "Hello";
        String [] wordArray = word.split("");
        int LowerCaseCount = 0;
        
        
        for (int index = 0; index < word.length(); index++) {
            if(wordArray[index].equals(wordArray[index].toLowerCase())){
                LowerCaseCount++;
            }
        }
       
        System.out.println(LowerCaseCount);
    }
}
