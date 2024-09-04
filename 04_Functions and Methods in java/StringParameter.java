public class StringParameter {
    public static void main(String[] args) {
        String personalized = myGreet("Sounak");
        System.out.println(personalized);

    }
    static String myGreet(String name)
    {
        String message = "Hello " + name;
        return message;
    }
    
}
