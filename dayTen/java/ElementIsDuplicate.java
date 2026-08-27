public class ElementIsDuplicate {
    public static boolean isDuplicate(int[] array){
        for(int index = 0; index < array.length; index++){
            for(int secondIndex = index + 1; secondIndex < array.length; secondIndex++){
                if(array[index] == array[secondIndex]){
                    return true;
                }
            }
        }
        return false;
    }
}


