import java.util.Scanner;
class Greeting03{
    public static void main(String[] args)
    {
        int ans = sum2();             //here the method is called.
        System.out.println(ans);
    }
    // return the value
    /* 
    
    static int sum2()                     //here the return type is int , that means it will return a int value where the method is called.
    {
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("\nEnter number 1 :");
        num1 = in.nextInt();
        System.out.println("\nEnter number 2 :");
        num2 = in.nextInt();
        sum = num1 + num2;
        in.close();
        return sum;
        
        
    }
    */
    static void greeting()
    {
        System.out.println("Hello World");
    }
}