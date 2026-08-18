public class MeanAndMedian {
    public static void main(String[] args){
        
        System.out.println(meanOf(1,2,2));
        medianOf(1,2,4);
        
    }
    public static double meanOf(int firstNumber, int secondNumber, int thirdNumber){
        double mean = (firstNumber + secondNumber + thirdNumber) / 3 ;
        
        return mean;
    }
    public static void medianOf(int firstNumber, int secondNumber, int thirdNumber) {
    
        if(firstNumber >= secondNumber && secondNumber >= thirdNumber){
           System.out.println("secondNumber");
        }
        else if(firstNumber >= secondNumber && thirdNumber >= secondNumber){
           System.out.println("thirdNumber");
        }
        else if(secondNumber >= firstNumber && firstNumber >= thirdNumber){
            System.out.println("firstNumber");
        }
        else if(secondNumber >= thirdNumber && thirdNumber >= firstNumber) {
            System.out.println("thirdNumber");
        }
        else if(thirdNumber >= firstNumber && firstNumber >= secondNumber) {
            System.out.println("firstNumber");
        }
        else if(thirdNumber >= secondNumber && secondNumber >= firstNumber) {
            System.out.println("secondNumber");
        }
        
    }
}

