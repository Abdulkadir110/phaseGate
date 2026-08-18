public class printHelloWorld {
    public static void main(String[] args){
        String textOne = "Hello";
        String textTwo = "World";
        
        System.out.println(interleaved(textOne, textTwo));
    }
    public static String interleaved(String textOne, String textTwo){
        String interleaved = "";
        String combined = "";
        combined = textOne + textTwo;

        for(int index = 0; index < 2; index++){
            interleaved += textOne.charAt(index);
            interleaved += textTwo.charAt(index);
        }
        for(int index = 2; index < 5; index++){
            interleaved += textTwo.charAt(index);
            interleaved += textOne.charAt(index);           
        }
        
        return interleaved;
    }
}
