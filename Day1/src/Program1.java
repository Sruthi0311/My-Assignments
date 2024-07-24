public class Program1 {
    int add(int a,int b) {
        return (a + b);
    }
    int add(int a,int b,int c){
        return (a+b+c);
    }
    double add(double a,double b){
        return (a+b);
    }
    String add(String a,int b){
        return (a+" "+b);
    }
    public static void main (String args[]){
        Program1 p1=new Program1();
        System.out.println("The Sum of Two numbers is:"+p1.add(10,20));
        System.out.println("The Sum of Three numbers is:"+p1.add(10,20,30));
        System.out.println("The Sum of Two numbers is:"+p1.add(10.5,20.1));
        System.out.println("The String is:"+p1.add("Hello",20));
    }
}
