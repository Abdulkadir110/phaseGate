
def is_prime(number):
    prime_counter = 0
    for index in range(1, number + 1) :
        if(number % index == 0):
            prime_counter += 1
    return prime_counter == 2;


def sorted_list(list):
    length = len(list)
    for index in range(length):
        for second_index in range(length):
            if(list[index] < list[second_index]):
                temp = list[index]
                list[index] = list[second_index]
                list[second_index] = temp
    return list

def array_of_primesIn(list):
    primes_list = []
    sorted_lists = sorted_list(list)
    for number in sorted_lists:
        if(is_prime(number)):
            primes_list.append(number)

    return primes_list

numbers = [5,9,3,6,2,]

print(array_of_primesIn(numbers))
