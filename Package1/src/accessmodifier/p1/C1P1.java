package accessmodifier.p1;

public class C1P1 {
    private int privateVar =1;
    //public int publicVar=1;
    public static void main(String[] args) {
        C1P1 c1p1=new C1P1();
        //The private variable is not accessible in other Classes
       System.out.println(c1p1.privateVar);
        //System.out.println(c1p1.publicVar);
    }

}
