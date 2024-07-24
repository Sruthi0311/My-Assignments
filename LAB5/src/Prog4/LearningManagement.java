package Prog4;
import java.util.Scanner;
public class LearningManagement {
public static void main(String[] args) {
    LearningModule learningModule = new LearningModule();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Your Age: ");
    int age = sc.nextInt();
    try {
        System.out.println("The Code is: " + learningModule.getLearningCode(name, age));
    }
    catch (WrongInputException wrongInputException){
        System.out.println(wrongInputException.getMessage());
    }

}
}
