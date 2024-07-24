package Prog1;

public class SingleTryFinal {
    public static void main(String[] args) {
        SingleTryFinal exception=new SingleTryFinal();
        int a=100;
        int b=0;
        int result=0;

        try{
            result=a/b;
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        finally {
                System.out.println(result);
        }

    }
}
