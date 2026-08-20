total = 0
average = 0
count = 0
for index in range(10):
    number = int(input("Enter a number: "))
    if number % 2 == 0: 
        total += number
        count += 1

average = total / count
print("sum is: ", total)
print("average is: ", average)


