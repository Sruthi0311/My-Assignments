import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double A=sc.nextDouble();
        System.out.println("Enter the Number:");
        double B=sc.nextDouble();
        double Sum=class2.Add(A,B);
        System.out.println("The Sum is:"+Sum);
        double Difference=class2.Sub(A,B);
        System.out.println("The Difference is:"+Difference);
            double Product=class2.Mul(A,B);
            System.out.println("The Product is:"+Product);
            double Division=class2.Div(A,B);
            System.out.println("The Division is:"+Division);


    }
}
