// Find largest among 3 numbers .
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter 3 numbers :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // 1. find the largest of the 3 numbers.
        /*
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max)
        {
            max =c;
        }
        System.out.println(max);
        */

        // 2nd way to solve the same qs:
        /* 
        
        int max = 0;
        if(a>b)
        {
            max = a;
        }
        else{
            max = b;
        }
        if(c>max){
            max =c;
        }
        */

        // 3rd way
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);


        System.out.println(Math.max(34,67));
        input.close();
    }
    
}
