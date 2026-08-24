def allBracketAreClosed(characters) :
    if(isCurlyBracket(characters) or isDiamond(characters) or isParenthesis(characters) or isSquareBracket(characters)) :
        return True;

    return False;

def isCurlyBracket(characters) :
    count = 0;
    for index in range(len(characters)):
        if(characters[index] == '{'):
            count += 1
        
        if(characters[index] == '}'):
            count += 1
            
    return count == 2;

def isSquareBracket(characters):
    count = 0;
    for index in range(len(characters)) :
        if(characters[index] == '['):
            count += 1
        
        if(characters[index] == ']'):
            count += 1

    return count == 2;

def isParenthesis(characters) :
    count = 0;
    for index in range(len(characters)) :
        if(characters[index] == '(') :
            count += 1
        
        if(characters[index] == ')') :
            count += 1
        
    
    
    return count == 2;

def isDiamond(characters) :
    count = 0;
    for index in range(len(characters)) :
        if(characters[index] == '<') :
            count += 1
        
        if(characters[index] == '>') :
            count += 1
        
    
    
    return count == 2;


