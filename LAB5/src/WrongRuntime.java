import java.util.Scanner;
public class WrongRuntime {
    public static void main(String[] args) throws WrongInputException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        try{
            if (number < 10) {
                WrongInputException wrongInputException=new WrongInputException("The Input is incorrect");
                throw wrongInputException;
            }
            System.out.println("The Input is correct");
        }
        catch(WrongInputException wrongInputException){
            System.out.println(wrongInputException.getMessage());
        }
    }
}
class WrongInputException extends RuntimeException{
    WrongInputException(String message){
        super(message);
    }

}
