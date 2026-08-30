from wrap_up_snacks import *

print("|-------------------|") 
print("| Armstrong Numbers |") 
print("|-------------------|") 
print() 

for number in range(1, 1001) :
    if is_armstrong(number) :
        print("Armstrong number --> " , number) 
    
print() 
print("|-----------------|") 
print("| Perfect Numbers |") 
print("|-----------------|") 
print() 

for number in range(1, 1001) :
    if is_perfect_number(number) :
        print("Perfect number --> " , number) 
    
print() 
print("|-----------------|") 
print("|   Leap Years    |") 
print("|-----------------|") 
print() 

for year in range(1900, 2026) :
    if is_leap_year(year) :
        print("Leap Year --> " , year) 

print() 
print("|---------------------------|") 
print("|   Number Of Leap Years    |") 
print("|---------------------------|") 
print()

leapYearCount = 0 
for year in range(1900, 2026) :
    if is_leap_year(year) :
        leapYearCount += 1
     
print("The Number of leap year is: " , leapYearCount) 
