import java.util.Scanner;

public class sum02 {
    public static void main(String[] args) {          //main function
        sum();         //the user defined is called
    }



    static void sum(){                           //user define functions
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("\nEnter number 1 :");
        num1 = in.nextInt();
        System.out.println("\nEnter number 2 :");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("\nThe sum is :"+ sum);

        in.close();
    }
    /*
    access modifier (we'll look in OOP) return_type name() {
    //body
    return statement;
    } 
    */
}
