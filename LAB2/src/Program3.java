import java.util.*;
public class Program3 {
    public int acceptNumber(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program3 number=new Program3();
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();
        System.out.print("Enter the third number:");
        int c=sc.nextInt();
        System.out.println("The Largest Number is: "+number.acceptNumber(a,b,c));



    }

}
