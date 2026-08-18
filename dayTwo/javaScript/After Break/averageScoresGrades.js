
function average_grade_of(firstScore,secondScore,thirdScore){
    let totalScore = firstScore + secondScore + thirdScore;
    let average = totalScore / 3
    
    if (average >= 90 && average <= 100) {
        console.log("\'A\'")
    }
    else if(average >= 80 && average < 90) {
        console.log("\'B\'")
    }
    else if(average >= 70 && average < 80) {
        console.log("\'C\'")
    }
    else if(average >= 60 && average < 70) {
        console.log("\'D\'")
    }  
    else {
        console.log("\'F\'")
    }
           
}

average_grade_of(80, 70, 60)
