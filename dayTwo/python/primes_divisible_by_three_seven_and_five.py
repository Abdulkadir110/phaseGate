
def reversedOf(number) :
    count = 0;
    reverse = 0
    digits = 0;
    while(number != 0):
        digits = number % 10;
        reverse = reverse * 10 + digits;
        number /= 10;

    return reverse;

 
num = 1
while(num <= 100) :
    if num % 3 == 0 :
        print("hello")
    
    elif num % 5 == 0 :
        print("world")
    
    elif num % 7 == 0 :
        print("orion")
    
    else :
        print(reversedOf(num))
    
    num += 1


