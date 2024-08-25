// Count no of digit in n 
/*
n = 134456389383 count no of 3 present here
ans = 4
*/
import java.util.Scanner;
public class CountNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number :");
        int n = sc.nextInt();
        System.out.println("\nEnter the no u want to count :");
        int key = sc.nextInt();
        int c = 0;
        while(n>0)
        {
            int rem = n%10;
            if(rem == key)
            {
                c++;
            }
            n = n/10;
        }
        System.out.println("\nNo of times number is present is :"+ c);



        sc.close();

    }
    
}
