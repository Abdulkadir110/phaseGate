public class LongestCommonPrefix{
    public static String theCommonPrefix(String[] words){
        String output = "";
        String firstWord = words.charAt(0);
        String nextWord = "";
        for(int index = 0; index < words.length; index++){
            for(int secondIndex = 1; secondIndex < words.length; secondIndex++){
                nextWord = words.charAt(secondIndex);
                if(firstWord.charAt(0) == nextWord.charAt(0) ){
                    output += firstWord.charAt(0);
                }
            }
        }
        return output;
   }
}



