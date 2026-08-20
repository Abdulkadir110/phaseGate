total = 0
count = 1
while count <= 10 :
    number = int(input("Enter a number: "))
    if number < 0 or number > 100 :
        print("Invalid input(Enter number between 1 to 100)")
    else :
        total += number;
        count += 1

print("sum is: ", total)


