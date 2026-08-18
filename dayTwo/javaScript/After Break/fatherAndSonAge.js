function calculateTheNumberOfYears(fatherAge, sonAge){
    let twiceSonAge = sonAge * 2;

    let difference = fatherAge - twiceSonAge;

    if(difference < 0){
        difference = difference * -1;
        console.log(`${difference} years ago`)       
    }
    else if(difference == 0){
        console.log("It will be this year!!")
    }
    else{
        console.log(`${difference} years from now`)
    }

}

console.log(calculateTheNumberOfYears(60, 28)) 

