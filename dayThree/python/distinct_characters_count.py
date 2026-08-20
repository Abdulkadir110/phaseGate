

def count_distinct_in(word) :
    lower_word = word.lower()
    total = 0
    alpha = "abcdefghijklmnopqrstuvwxyz0123456789"
    for index in alpha:
        character = index
        duplicate_counter = 0
        
        for second_index in lower_word:
            if character == second_index:
                duplicate_counter += 1
        if duplicate_counter > 1 :
            total += 1
    return total

word = "a11BAcb"

print(count_distinct_in(word))  


