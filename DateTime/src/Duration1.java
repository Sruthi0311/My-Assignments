import java.time.Duration; //In java.time package There is a class called Duration.
import java.time.Instant;

public class Duration1 { //Creating a class called Duration1
    public static void main(String args[]){ //Main method
        Duration duration1=Duration.ofHours(4); //Assigning Value for duration1
        Duration duration2=Duration.ofMinutes(30); //Assigning Value for duration2
        //multipliedBy();
        Duration multiply=duration1.multipliedBy(4);//To perform multiplication operation we are using MultiplyBy() method.
        System.out.println("The Duration after Multiplication is: "+multiply);//The output will be printed after multiplication.
        //dividedBy();
        Duration divide=duration1.dividedBy(2);//To Perform Division Operation we are using DivideBy()method.
        System.out.println("The Duration after Division is: "+divide);//The output will be printed after Division.
        //compareTo();
              if(duration1.compareTo(duration2)>0){ //WE are Using CompareTo()method to compare the duration 1 and duration 2 as input.
            System.out.println("Duration 1 is Longer than Duration 2");// if the duration1 is greater than 0 then it is longer than duration2.
        }
        else if(duration1.compareTo(duration2)<0){//if the duration1 is lesser than 0 then it is shorter than duration2.
            System.out.println("Duration 1 is Shorter than Duration 2 ");
        }
        else{
            System.out.println("Both Durations are Equal");//if both the conditions does not pass it equals 0.
        }
        long seconds=duration1.getSeconds();//we use getSeconds()method to convert the given duration into seconds.
        System.out.println("The Seconds of the Duration1 is: "+seconds);
       // int nanos=duration1.getNano(); //we use getNano()method to convert the given duration into Nanoseconds.
        //System.out.println("The Nanos of the Duration2 is: "+nanos);
        System.out.println(duration2.getNano());
        //isNegative();
        Duration value1=duration2.minus(duration1);//the minus method here subtracts both the duration and returns the value.
        System.out.println("The Output of value1 is: "+value1.isNegative());//the isNegative()method is used to find whether the returned output is negative or not.
        System.out.println("The Output of duration2 is: "+duration2.isNegative());//we are simply checking whether the duration is negative or not.
        //isZero();
        Duration value2=Duration.ZERO;//we are using zero value to Identify whether  the value is zero or not.
        System.out.println("If the Duration Given = zero then it is: "+value2.isZero());//If the output is 0 it returns as true else false.
        System.out.println("If the Duration Given !=zero then it is: "+duration2.isZero());
        //abs();
        System.out.println(value1);
        System.out.println("The Absolute Value of Duration1 is: "+value1.abs());//abs()is used to return the same absolute value of the given duration.
        System.out.println(duration1.compareTo(duration2));
        //Nanoseconds
        long nano1=duration1.toNanos();
        System.out.println("Hours into NanoSeconds: "+nano1);
    }
}
