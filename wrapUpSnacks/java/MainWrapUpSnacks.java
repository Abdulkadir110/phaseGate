public class MainWrapUpSnacks{
    public static void main(String[] args) {
        
        System.out.println("|-------------------|");
        System.out.println("| Armstrong Numbers |");
        System.out.println("|-------------------|");
        System.out.println();
        
        for(int number = 1; number <= 1000; number++){
            if(WrapUpSnacks.isArmstrong(number)){
                System.out.println("Armstrong number --> " + number);
            }
        }
        System.out.println();
        System.out.println("|-----------------|");
        System.out.println("| Perfect Numbers |");
        System.out.println("|-----------------|");
        System.out.println();
        
        for(int number = 1; number <= 1000; number++){
            if(WrapUpSnacks.isPerfectNumber(number)){
                System.out.println("Perfect number --> " + number);
            }
        }
        
        System.out.println();
        System.out.println("|-----------------|");
        System.out.println("|   Leap Years    |");
        System.out.println("|-----------------|");
        System.out.println();
        
        for(int year = 1900; year <= 2025; year++){
            if(WrapUpSnacks.isLeapYear(year)){
                System.out.println("Leap Year --> " + year);
            }
        }
        
        System.out.println();
        System.out.println("|---------------------------|");
        System.out.println("|   Number Of Leap Years    |");
        System.out.println("|---------------------------|");
        System.out.println();
        int leapYearCount = 0;
        for(int year = 1900; year <= 2025; year++){
            if(WrapUpSnacks.isLeapYear(year)){
                leapYearCount++;
            }
        }
        System.out.println("The Number of leap year is: " + leapYearCount);
    }
}
