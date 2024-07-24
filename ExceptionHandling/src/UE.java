public class UE {
    public static void main(String[] args) {
        System.out.println("1");
        int a =100;
        int b=0;
        int j=0;
        try{
            System.out.println("2");
            j=a/b;
            System.out.println("3");
            System.out.println("Value:"+j);
        }
        catch(NullPointerException ne){
            System.out.println("4");
            System.out.println(ne);
        }
        catch(Throwable throwable){
            System.out.println("5");
            System.out.println(throwable);
        }
        finally {
            System.out.println("6");
        }
        System.out.println("7");
        System.out.println(j);
    }
}
