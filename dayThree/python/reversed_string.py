
word = "Hello"

reverse = ""
length = len(word);
for letter in range(length - 1, -1, -1) :
    
    reverse += word[letter]
    
    
print(reverse)
