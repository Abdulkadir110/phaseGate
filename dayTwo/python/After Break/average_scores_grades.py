
def averageGradeOf(first_score, second_score,third_score):
    total_scores = first_score + second_score + third_score
    average = total_scores / 3
    
    if 90 <= average <= 100 :
        print("\'A\'")
    elif 80 <= average < 90 :
        print("\'B\'")
    elif 70 <= average < 80 :
        print("\'C\'")
    elif 60 <= average < 70 :
        print("\'D\'")
    else :
        print("\'F\'")
        

averageGradeOf(50,70,40)        

