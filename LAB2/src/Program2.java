import java.util.Scanner;
public class Program2 {
    public String name(String name1){
        return "Hello "+ name1 +", Welcome to Java World!";

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Program2 program = new Program2();
        System.out.println("Enter your name: ");
        System.out.println(program.name(scanner.nextLine()));

    }
}
