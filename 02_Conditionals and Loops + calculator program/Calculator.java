// Calculator program
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        // take input from user till user does not press x or X.
        while(true)
        {
            // take operator input
            System.out.println("\nEnter the operator");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input 2 numbers 
                System.out.println("\nEnter 2 numbers :");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+')
                {
                    ans = num1+num2;
                    System.out.println("\nThe ans is :"+ ans);
                }
                
                if(op == '-')
                {
                    ans = num1-num2;
                    System.out.println("\nThe ans is :"+ ans);
                }
                
                if(op == '*')
                {
                    ans = num1*num2;
                    System.out.println("\nThe ans is :"+ ans);
                }
                
                if(op == '/')
                {
                    if(num2!=0)
                    {
                        ans = num1/num2;
                        System.out.println("\nThe ans is :"+ ans);
                    }
                }
                
                if(op == '%')
                {
                    ans = num1%num2;
                    System.out.println("\nThe ans is :"+ ans);
                }
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("\nInvalid operation!!");
            }
        }

        in.close();

    }
    
}
