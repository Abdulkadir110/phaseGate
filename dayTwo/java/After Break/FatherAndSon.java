public class FatherAndSon {
    public static void main(String[] args){
        calculateTheNumberOfYears(76, 50);
    }
    public static void calculateTheNumberOfYears(int fatherAge, int sonAge){
        int twiceSonAge = sonAge * 2;
        int difference = fatherAge - twiceSonAge;
        if(difference < 0){
            difference = difference * -1;
            System.out.println("It was " + difference + "years ago");
        }
        else if(difference == 0){
            System.out.println("It will be this year");
        }
        else{
            System.out.println("It will be in " + difference + "years time");
        }
    }
}
