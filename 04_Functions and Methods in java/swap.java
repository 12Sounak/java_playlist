public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
        /*
        int temp = a;
        a = b;
        b = temp;
        */
        swapp(a,b);
        



    }

    static void swapp(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }


}
