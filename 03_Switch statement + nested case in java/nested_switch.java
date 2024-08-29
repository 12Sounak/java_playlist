import java.util.Scanner;
public class nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch(empID)
        {
            case 1:
                System.out.println("abc");
                break;
                
            case 2:
                System.out.println("def");
                break;
                
            case 3:
                switch(department)
                {
                    case "IT":
                        System.out.println("IT dept");
                        break;
                    case "Management" :
                        System.out.println("Management dept");
                        break;
                    default:
                        System.out.println("No department");
                }
                default:
                    System.out.println("Enter correct EmpID");
                
        }
        in.close();
    }
    
}
