function addOneToTheLastIn(array) {
    let newArray = new Array(array.length + 1).fill(0);

    let lastElement = array[array.length - 1] + 1;

    if (lastElement < 10) {
        array[array.length - 1] = lastElement;
        return array;
    }

    for (let index = 0; index < array.length - 1; index++) {
        newArray[index] = array[index];
    }

    newArray[array.length - 1] = 1;
    newArray[array.length] = 0;

    return newArray;
}

let numbers = [1, 2, 9];

console.log(addOneToTheLastIn(numbers));
