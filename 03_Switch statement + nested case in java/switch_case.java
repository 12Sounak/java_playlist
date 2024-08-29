// program 1 : 
import java.util.Scanner;
public class switch_case{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the fruit name :");
        String fruit = in.next();

        /*
        
        String a = "sounak";
        String b = "sounak";
        System.out.println(a==b);        //a and b is pointing to wards the same object (== checks the reference)
        */
        
        // This is not a good way to perform a program
        /*
        
        if(fruit.equals("mango")){
            System.out.println("\nking of fruit");
        }
        
        if(fruit.equals("apple")){
            System.out.println("\na sweet red fruit");
        }
        */
        /*
        
        switch(fruit)
        {
            case "Mango":
            System.out.println("\nKing of Fruits");
            break;
            
            case "Apple":
            System.out.println("\nA sweet Red fruit");
            break;
            case "Orange":
            System.out.println("\nRound Fruit");
            break;
            case "Grapes":
            System.out.println("\nSmall fruit");
            break;
            default:
            System.out.println("\nPlease enter a valid fruit");
        }
        
        */
        switch(fruit)
        {
            case "Mango" -> System.out.println("\nKing of Fruits");
            
            case "Apple" -> System.out.println("\nA sweet Red fruit");
            case "Orange" ->System.out.println("\nRound Fruit");
            case "Grapes" -> System.out.println("\nSmall fruit");
            default -> System.out.println("\nPlease enter a valid fruit");
        }
        in.close();
    }
}