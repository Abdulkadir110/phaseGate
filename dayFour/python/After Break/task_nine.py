total = 0
count = 1
while count <= 10 :
    number = int(input("Enter a number: "))
    if 0 <= number <= 100 :
        total += number;        
    count += 1

print("sum is: ", total)


