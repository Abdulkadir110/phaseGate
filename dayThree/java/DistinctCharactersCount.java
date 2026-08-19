public class DistinctCharactersCount {

    public static void main(String[] args) {
        String word = "abcdef";
        
    }
    public static int countUpperCase(String  word) {
        int upperCount = 0;
        String upper= "ABCDEFGHIJKLMNOPQURSTUVWXYZ"
        for(int index = 0; index < word.length(); index++) {
            for(int upperIndex = 0; upperIndex < upper.length(); upperIndex++){
                if(word.charAt(index) == upper.charAt(upperIndex)) {
                    upperCount++;
                    break;
                }
            }
            
        }
        return upperCount;
    }
    public static int countLowerCase(String word) {
        int lowerCount = 0;
        
    }
    
}
