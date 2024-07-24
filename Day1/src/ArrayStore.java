import java.util.Arrays;
import java.util.Scanner;
public class ArrayStore {

    int arr[] = new int[10];
    int size = 0;
    public void acceptInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            size++;
        }
        System.out.println();
    }

    public void printArray() {
        int i=0;
        while(i<size){
            System.out.print(arr[i]+" ");
            i++;

        }
        System.out.println();
    }

    public void displayArray() {
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void sortArray(){

        Arrays.sort(arr);
    }
    public int returnNumber(int num){
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }
    public void insertNumber(int num1,int position){
       // int size = 6;
        //arr[position]=num;
        for(int i=size-1;i>=position;i--){
            arr[i]=arr[i-1];
        }
        arr[position-1]=num1;
    }
    public int returnArray(){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if((arr[i]!=0)&&(arr[j]!=0)&&(arr[i]==arr[j])){
                    arr[j]=0;
                }
            }
        }
        for(int i=0;i<size;i++){
            int size=0;
            if(arr[i]!=0){
                System.out.print(arr[i]+" ");
                size++;
            }
        }
        return size;
    }

    public static void main(String args[]) {
        ArrayStore acceptnumber=new ArrayStore();
        acceptnumber.acceptInteger();
        System.out.println("Display the Elements using While Loop");
        acceptnumber.printArray();
        System.out.println("Display the Elements using For Loop");
        acceptnumber.displayArray();

        acceptnumber.sortArray();
        System.out.println("Sorted array");
        acceptnumber.displayArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("No.of times Occured:");
        int num=sc.nextInt();
        int count=acceptnumber.returnNumber(num);
        System.out.println("No.of Occurences of " + num + " is " + count);
//        acceptnumber.insertNumber(num);
        System.out.println("The number To be Inserted in the Array is");
        int num1=sc.nextInt();
        System.out.println("Enter the position to Insert the number:");
        int position=sc.nextInt();
        System.out.println("The Array After Insertion:");
        acceptnumber.insertNumber(num1,position);
        acceptnumber.displayArray();
        System.out.println("The Array After Excluding Duplicate Elements:");
        acceptnumber.returnArray();
        //acceptnumber.displayArray();
    }
    }
