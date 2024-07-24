public class CheckedException {
    public static void main(String[] args) {
        int age=20;
        try{
            if (age<21||age>60){
                InvalidAgeException invalidAgeException=new InvalidAgeException("Its not a valid age");
                throw invalidAgeException;
            }
            System.out.println("The age is Valid");
        }
        catch (InvalidAgeException invalidAgeException){
            System.out.println(invalidAgeException.getMessage());
        }
    }
}
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }

}
