total = 0
count = 1
average = 0
while count <= 10 :
    number = int(input("Enter a number: "))
    if 0 <= number <= 100 :
        total += number;
    else :
        number = 0   
    count += 1

average = total / count
print("average is: ", average)


