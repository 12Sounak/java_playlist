// Q> find nth fibonacci no
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.println("\nEnter the nth term :");
        int n = sc.nextInt();
        while(count <= n)
        {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("\nThe nth Fobonacci no is :" + b);


        sc.close();
    }
    
}
