//tkae input of 2 numbers and print the sum.
import java.util.Scanner;
public class method01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("\nEnter number 1 :");
        num1 = in.nextInt();
        System.out.println("\nEnter number 2 :");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("\nThe sum is :"+ sum);

        // if it is asked to do take input again and again and sum the numbers 10 times or 100 times but use the same piece of code again and again it is not possible.

        in.close();
    }    
}