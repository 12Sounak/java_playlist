import java.util.Scanner;
public class sumParameter05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter Two numbers :");
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = sum(a,b);
        System.out.println("\nThe Sum is :" + ans);

        in.close();
    }
    static int sum(int num1,int num2)
    {
        int sum = num1 + num2;
        return sum;
    }
    
}
