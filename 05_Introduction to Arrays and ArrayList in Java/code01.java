class code01{
    public static void main(String[] args) {
        // Q: store a roll number
        // int a = 10;


        //Q: store a person name 
        // String name = "Iron Man";

        // Q: Store 5 roll numbers
        /*
        int rno1 = 23;
        int rno2 = 25;
        int rno3 = 34;
        int rno4 = 54;
        int rno5 = 60;
        */
        // if is asked to store 500 roll number it is not possible to store so , so we need arrays
        // array is a collection of dataTypes

        // Syntax
        // datatype[] vaiable_name = new datatype[size];
        


        // Q: Store 5 roll numbers :
        // int[] rno = new int[5];
        // or directly
        // int[] rno1 = {23,12,45,23,15};           //arrays has same kind of datatypes



        // int[] ros;     //declaration of array. ros is getting defined in the stack.
        // ros = new int[5]; //actualy here abject is being created in the heap memory.

        // int[] arr = new int[5]; 
        /* 
        above int is the datatype, arr is the reference variable , new int[5] is creating the object in heap memory, new is used to crete an object
        */


        // int[] ros;
        // ros = new int[5];

        // System.out.println(ros[1]);             //by default the values are always zero.

        String[] arr = new String[4];
        System.out.println(arr[0]);        //String by default has null value.

        // for(String element:arr){
        //     System.out.println(element);
        // }
        // String str = null;  
        // int num = null;        //int can't be assigned to null
    }
}