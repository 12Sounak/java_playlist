import java.util.Scanner;
import java.util.Arrays;
public class input02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Array of Primitives.
        // int[] arr = new int[5];
        // storing the values according to indexes
        /*
        
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 345;
        arr[3] = 112;
        arr[4] = 10;
        // [23,45,345,112,10]
        System.out.println(arr[3]);     //print the value in index 3.
        */

        // input using for loop
        /*
        System.out.println("\nEnter the array elements :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = in.nextInt();
        }
        */
        /*
         
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        */
        // this is for each loop.
        /*
        
        for(int num : arr){                 // for every element in the attay print the element.
        System.out.println(num + " ");      //here num represents the element of the array
        }
        */
        // System.out.println(Arrays.toString(arr));



        // Array Of Objects.
        String[] str = new String[4];
        for(int i=0;i<str.length;i++)
        {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "batman";

        System.out.println(Arrays.toString(str));
        in.close();
    }    
}
