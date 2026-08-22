public class SortedArrayOfPrimes {
    public static void main(String [] args) {
        int[] numbers = {5,9,3,6,2};
        System.out.println(arraysOfPrimesIn(numbers));
    }
    
    public static boolean isPrime(int number) {
        int primeCounter = 0;
        for(int index = 1; index <= number; index++){
            if(number % index == 0){
                primeCounter++;
            }
        }
        return primeCounter == 2;
    }
    public static int[] sortedArrayOf(int [] numbers){
        
        for(int index = 0; index < numbers.length; index++){
            for(int secondIndex = index + 1; secondIndex < numbers.length; secondIndex++){
                if(numbers[index] > numbers[secondIndex]){
                    int temp = numbers[index];
                    numbers[index] = numbers[secondIndex];
                    numbers[secondIndex] = temp;
                }
            }
        }
        return numbers;
    }
    public static int countNumberOfPrimesIn(int[] numbers) {
        int count = 0;
        for(int index = 0; index < numbers.length; index++){
            if(isPrime(numbers[index])){
                count++;
            }
        }
        return count;
    }
    public static int[] arraysOfPrimesIn(int [] numbers){
        int [] primes = new int [countNumberOfPrimesIn(numbers)];
        int [] sortedArray = sortedArrayOf(numbers);
        int primesIndex = 0;
        for(int index = 0; index < sortedArray.length; index++){
            if(isPrime(sortedArray[index])){
                primes[primesIndex] = sortedArray[index];
                primesIndex++;
            }
        }
        return primes;
    }
}


