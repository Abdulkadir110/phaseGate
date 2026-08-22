
def move_all_zeros_in(list):
    length = len(list)
    for index in range(length):
        for second_index in range(length):
            if(list[index] < list[second_index]):
                temp = list[index]
                list[index] = list[second_index]
                list[second_index] = temp
    return list

numbers = [2,0,6,3,6,8,6]
print(move_all_zeros_in(numbers))
