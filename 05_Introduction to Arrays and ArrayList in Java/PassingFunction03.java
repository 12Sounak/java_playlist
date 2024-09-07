import java.util.Arrays;

public class PassingFunction03 {
    public static void main(String[] args) {
        // Strings are immutable in java and arrays are multable in java.
        int[] nums = {2,3,4,12};
        System.out.println(Arrays.toString(nums));   //array before modify
        change(nums);
        System.out.println(Arrays.toString(nums));   //arrays after modify
    }   
    static void change(int[] arr){
        arr[0] = 99;
    } 
}
