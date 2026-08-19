digit = "0123456789"
space = " "

def count_number_digits(word) :
    digit_count = 0
    for character in word :
        if character in digit:
            digit_count += 1
            break
    return digit_count
    

def count_number_upper_case(word) :
    upper_count = 0
    for character in word:
        if(character.isupper()):
            upper_count += 1
            break;
    return upper_count
    
def count_number_lower_case(word) :
    lower_count = 0
    for character in word:
        if(character.islower()) :
            lower_count += 1
            break
    return lower_count
    
def check_inputted_string(word):
    total = 0
    for character in word :
        if character.isupper and character in digit or character.islower and not space :
            total = count_number_digits(word) + count_number_lower_case(word) + count_number_upper_case(word)
    return total
    
 
word = "acbBA111"
print(check_inputted_string(word))
