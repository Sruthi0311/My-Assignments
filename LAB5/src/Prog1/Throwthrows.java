package Prog1;

public class Throwthrows {
    public static void main(String[] args)throws AgeInvalidException {
        int age=20;
        try{
            if (age<21||age>60){
                AgeInvalidException ageInvalidException=new AgeInvalidException();
                throw ageInvalidException;
            }
            System.out.println("The age is Valid");
        }
        catch (AgeInvalidException ageInvalidException){
            System.out.println("Its not a valid age");
        }


    }
}
class AgeInvalidException extends RuntimeException {

}
