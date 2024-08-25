// Reverse a number
/*
n = 19086
ans = 86091
*/
import java.util.Scanner;
public class Reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number :");
        int n = sc.nextInt();
        int ans=0;
        while(n>0)
        {
            int rem = n % 10;
            ans = ans*10 + rem;
            n=n/10;
        }
        System.out.println("The reverse no is :" + ans);

        sc.close();


    }
    
}
