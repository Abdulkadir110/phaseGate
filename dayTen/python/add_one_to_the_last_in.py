def add_one_to_the_last_in(array):
    new_array = [0] * (len(array) + 1)

    last_element = array[-1] + 1

    if last_element < 10:
        array[-1] = last_element
        return array

    for index in range(len(array) - 1):
        new_array[index] = array[index]

    new_array[len(array) - 1] = 1
    new_array[len(array)] = 0

    return new_array


numbers = [1, 2, 9]
print(add_one_to_the_last_in(numbers))
