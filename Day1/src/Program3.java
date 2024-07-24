public class Program3 {
    public static void main(String[] args) {
        Program3 mul=new Program3();
        mul.multiplicationFor(3);
        mul.multiplicationWhile(7);
        mul.multiplicationDoWhile(17);

    }
    void multiplicationFor(int a){
        for(int i=1;i<=10;i++){
            System.out.println(a*i);
        }
    }
    void multiplicationWhile(int a){
        int i=1;
        while(i<=10)
        {
            System.out.println(a*i);
            i++;
        }
    }
    void multiplicationDoWhile(int a){
        int i=1;
        do{
            System.out.println(a*i);
            i++;
        }while(i<=10);

    }

}

