
 function countDistinct(word) {
        let lowerWord = word.toLowerCase();
        let total = 0;
        let alnum = "abcdefghijklmnopqrstuvwxyz0123456789";
        let duplicateCounter = 0; 
        for(let index = 0; index < alnum.length(); index++) {
            let character = alnum.charAt(index);
            duplicateCounter = 0;
            for(let secondIndex = 0; secondIndex < word.length(); secondIndex++){
                if(character == lowerWord.charAt(secondIndex)) {
                    duplicateCounter++;
                }
            }
            
            if(duplicateCounter > 1) {
                total++;
            }
            
        }
        return total;
    }
    
}


        let word = "a111BAcb";
        console.log(countDistinct(word));
