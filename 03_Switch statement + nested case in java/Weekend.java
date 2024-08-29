// print if its weekend or weekday
import java.util.Scanner; 
public class Weekend {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the day number :");
        int day = sc.nextInt();
        /* 
        
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("\nWeekday");
            break;
            case 6:
            case 7:
            System.out.println("Weekend");
            break;
            default:
            System.out.println("\nEnter a valid number !");
            break;
        }
        */
        //Way - 2
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
        sc.close();
    }
    
}
