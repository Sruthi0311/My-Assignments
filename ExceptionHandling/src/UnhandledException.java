public class UnhandledException {
    public static void main(String[] args) {
        String str = "Welcome";
        String uppercase = str.toUpperCase();
        System.out.println(uppercase);
        System.out.println("Caller begin");
        called();
        System.out.println("Back to caller");
    }
    private static void  called(){
        System.err.println("The Calculator app");
        int num1=0,num2=200;
        int result=0;
        try{
            result=num2/num1;
            System.out.println("Will this execute?");
        }
        catch (ArithmeticException arithmeticException)
        {
            System.out.println("Divide by zero"+arithmeticException);
        }
        System.err.println(result);
        System.err.println("Shutting down calculator");




    }
}