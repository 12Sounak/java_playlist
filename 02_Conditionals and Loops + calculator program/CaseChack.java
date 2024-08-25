// Alphabet Case Check
import java.util.Scanner;
public class CaseChack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Upper Case");
        }

        // System.out.println(in.next());
        // System.out.println(in.next().trim());

        // String word = "hello";
        // System.out.println(word.charAt(0));

        in.close();

    }
    
}
