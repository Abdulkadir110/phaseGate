
number =  1234;
number = str(number)
length = len(number)
number = int(number)

reverse = 0;
digit = 0;
counter  = 0


while(counter != length):
    digit = number % 10
    reverse = (reverse * 10) +  digit;
    number //= 10;
    counter +=1
    
print(reverse); 
