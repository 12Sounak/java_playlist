import java.util.Arrays;
import java.util.Scanner;
public class MultiDimension_array04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            1 2 3 
            4 5 6
            7 8 9      //3-rows and 3 columns
        */
        // define
        // or methods for initialization
        // int[][] arr = new int[3][3];       //defining noofrows is mandatory not column
        /*
        
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] arr1 = {
            {1,2,3}, //0th index
            {3,4},      //1st index
            {6,7,8,9}       //2nd index   arr1[2] = {6,7,8,9} , arr[2][0] = {6} 
        };            //this is also possible as we don't need to define the noof column.
        */
        int[][] arr = new int[3][3];
        System.out.println(arr.length);      //no of rows
       // input
       System.out.println("\nEnter the 2d-array elements :");
        for(int row=0;row<arr.length;row++)
        {
            // for each column in every row
            for(int col=0;col<arr[row].length;col++)
            {
                arr[row][col] = sc.nextInt();
            }
        }
        // output
        System.out.println("\nThe 2d-Array elements :");
        /*
        // method-1 to print the array:
        for(int row=0;row<arr.length;row++)
        {
            // for each column in every row
            for(int col=0;col<arr[row].length;col++)
            {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
        */
        // method - 2 to print the 2d-array
        /*
        
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        */
        // method - 3 to print the 2d-array
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));

        }



        sc.close();
    }
    
}
