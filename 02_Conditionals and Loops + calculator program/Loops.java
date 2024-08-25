// For Loop



import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        //Loops
        //print hello world 5 times
        /*
        
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        */
        // Syntax of For loops:
        /*
        for(initialization ; condition ; increment/decrement)
        {
            //body
        }
        */
        // Q: Print numbers from 1 to 5
        /*
        
        for(int num=1;num<=5;num++)
        {
            System.out.println(num);
        }
        */

        // Print number from 1 to n.
        /*
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            System.out.println(i +" ");
        }
        
        
        input.close();
        
        */

        // print hello world n no of times.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println("Hello World");
        }


        input.close();
    }
    
}
