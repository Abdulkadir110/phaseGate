public class averageScoresGrades {
    public static void main(String[] args){
        averageGradeOf(80, 70, 60);
    }
    public static void averageGradeOf(int firstScore, int secondScore, int thirdScore){
        double totalScore = firstScore + secondScore + thirdScore;
        double average = totalScore / 3;
        
        if (average >= 90 && average <= 100) {
            System.out.println("\'A\'");
        }
        else if(average >= 80 && average < 90) {
            System.out.println("\'B\'");
        }
        else if(average >= 70 && average < 80) {
            System.out.println("\'C\'");  
        }
        else if(average >= 60 && average < 70) {
            System.out.println("\'D\'"); 
        }
            
        else {
            System.out.println("\'F\'");
        }  
    }
}
