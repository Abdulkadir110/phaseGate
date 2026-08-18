import java.util.Scanner;
public class LikeSystem {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the number of people that want to like: ");
     int numberOfPeople = input.nextInt();

     String[] names = new String[numberOfPeople];
            String items = """
                1) Butter
                2) Bread
                3) WaterMelon
                4) PineApple 
                5) Nothing       
            """;
            System.out.println(items);

            for(int index = 0; index < names.length; index++){
                System.out.print("Enter the names of the people that like similar items: ");           
                names[index] = input.next();
            }
            
            likesPost(names);
    }
    public static void likesPost(String[] list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter what they like in common: ");
        String likesItem = input.nextLine();            
        for(int index = 0; index < list.length; index++){
             System.out.print(list[index] + ", ");
        }
        System.out.println("like " + likesItem);

    }

}
