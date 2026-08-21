public class LongestCommonPrefix{
    public static String theCommonPrefix(String[] words){
        String output = "";
        for(int index = 0; index < words.length; index++){
            for(int secondIndex = 1; secondIndex < words.length; secondIndex++){
                if(words.charAt(index) == words.charAt(secondIndex)){
                    output = words.charAt(index);
                }
            }
        }
        return output;
   }
}



