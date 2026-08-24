
    function allBracketAreClosed(characters){
        if(isCurlyBracket(characters) || isDiamond(characters) || isParenthesis(characters) || isSquareBracket(characters)){
            return true;
        }
        return false;
    }
    function isCurlyBracket( characters){
        let count = 0;
        for(let index = 0; index < characters.length(); index++){
            if(characters.charAt(index) == '{'){
                count++;
            }
            if(characters.charAt(index) == '}'){
                count++;
            }
        }
        
        return count == 2;
    }
    function isSquareBracket( characters){
        let count = 0;
        for(let index = 0; index < characters.length(); index++){
            if(characters.charAt(index) == '['){
                count++;
            }
            if(characters.charAt(index) == ']'){
                count++;
            }
        }
        
        return count == 2;
    }
    function isParenthesis( characters){
        let count = 0;
        for(let index = 0; index < characters.length(); index++){
            if(characters.charAt(index) == '('){
                count++;
            }
            if(characters.charAt(index) == ')'){
                count++;
            }
        }
        
        return count == 2;
    }
    function isDiamond( characters){
        let count = 0;
        for(let index = 0; index < characters.length(); index++){
            if(characters.charAt(index) == '<'){
                count++;
            }
            if(characters.charAt(index) == '>'){
                count++;
            }
        }
        
        return count == 2;
    }
