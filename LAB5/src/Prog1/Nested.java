package Prog1;

public class Nested {
    public static void main(String[] args) {
        int a=100;
        int b=0;
        int result=0;
        String str= null;
        try{
            try{
                System.out.println(str.toUpperCase());
            }
           catch(NullPointerException ne){
                System.out.println(ne);
           }
            finally {
                System.out.println("inside finally");
            }
            result=a/b;
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        finally {
            System.out.println("outside finally");
        }

    }

}