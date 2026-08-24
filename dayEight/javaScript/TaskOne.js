    function isEven(number) {
       return number % 2 == 0;
    }
    function isOdd(number) {
        return number % 2 != 0;
    }
    function AddOneToEveryOddAndMultiplyEveryEvenIn(numbers) {
        let newArray = [];
        
        for(let index = 0; index < numbers.length; index++){
            if(isEven(numbers[index])) {
                newArray.push(numbers[index] * 2);
            }
            else if(isOdd(numbers[index])){
                newArray.push(numbers[index] + 1);
            }
        }
        return newArray;
    }

let numbers = [2,8,14,5,1];
console.log(AddOneToEveryOddAndMultiplyEveryEvenIn(numbers))
