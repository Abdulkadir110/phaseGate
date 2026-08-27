function isDuplicate(array){
    for(let index = 0; index < array.length; index++){
        for(let secondIndex = index + 1; secondIndex < array.length; secondIndex++){
            if(array[index] == array[secondIndex]){
                return true;
            }
        }
    }
    return false;
}



