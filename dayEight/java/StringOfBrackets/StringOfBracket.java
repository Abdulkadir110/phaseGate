public class StringOfBracket {
    public static boolean allBracketAreClosed(String characters){
        if(isCurlyBracket(characters) || isDiamond(characters) || isParenthesis(characters) || isParenthesis(characters)){
            return true;
        }
        return false;
    }
    public static boolean isCurlyBracket(String characters){
        int count = 0;
        for(int index = 0; index < characters.length(); index++){
            if(characters.charAt(index) == '{'){
                count++;
            }
            if(characters.charAt(index) == '}'){
                count++;
            }
        }
        
        return count == 2;
    }
    public static boolean isSquareBracket(String characters){
        int count = 0;
        for(int index = 0; index < characters.length(); index++){
            if(characters.charAt(index) == '['){
                count++;
            }
            if(characters.charAt(index) == ']'){
                count++;
            }
        }
        
        return count == 2;
    }
    public static boolean isParenthesis(String characters){
        int count = 0;
        for(int index = 0; index < characters.length(); index++){
            if(characters.charAt(index) == '('){
                count++;
            }
            if(characters.charAt(index) == ')'){
                count++;
            }
        }
        
        return count == 2;
    }
    public static boolean isDiamond(String characters){
        int count = 0;
        for(int index = 0; index < characters.length(); index++){
            if(characters.charAt(index) == '<'){
                count++;
            }
            if(characters.charAt(index) == '>'){
                count++;
            }
        }
        
        return count == 2;
    }
}
