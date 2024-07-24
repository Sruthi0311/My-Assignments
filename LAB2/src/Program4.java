import java.util.*;
public class Program4 {
    public String accept3Digit(int a){
        String num[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String output="";
        while(a!=0){
            int rem=a%10;
            a=a/10;
            output=num[rem]+" "+output;
        }
      return output.trim();
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Program4 words = new Program4();
        System.out.println("Enter a 3 digit number:");
        int a=sc.nextInt();
        System.out.println("The Output is:");
        System.out.println(words.accept3Digit(a));

    }

}
