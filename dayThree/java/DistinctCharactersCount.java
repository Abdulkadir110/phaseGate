public class DistinctCharactersCount {

    public static void main(String[] args) {
        String word = "a111BAcb";
        System.out.println(countDistinct(word));
    }
    public static int countDistinct(String  word) {
        String lowerWord = word.toLowerCase();
        int total = 0;
        String alnum = "abcdefghijklmnopqrstuvwxyz0123456789";
        int duplicateCounter = 0; 
        for(int index = 0; index < alnum.length(); index++) {
            char character = alnum.charAt(index);
            duplicateCounter = 0;
            for(int secondIndex = 0; secondIndex < word.length(); secondIndex++){
                if(character == lowerWord.charAt(secondIndex)) {
                    duplicateCounter++;
                }
            }
            
            if(duplicateCounter > 1) {
                total++;
            }
            
        }
        return total;
    }
    
}
