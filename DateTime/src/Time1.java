import java.time.LocalTime;
public class Time1 {
    public static void main(String args[]){
        LocalTime particulartime1= LocalTime.of(6,34,44,988888);
        System.out.println("The Particular Time 1 is "+particulartime1);
        LocalTime particulartime2= LocalTime.of(2,27,44);
        System.out.println("The Particular Time 2 is "+particulartime2);
        LocalTime particulartime3= LocalTime.of(8,56);
        System.out.println("The Particular Time 3 is "+particulartime3);
        LocalTime presenttime=LocalTime.now();
        System.out.println("The Present Time is "+presenttime);
        LocalTime maxtime=LocalTime.MAX;
        System.out.println("The Maximum Time of the Day is "+maxtime);
        LocalTime mintime=LocalTime.MIN;
        System.out.println("The Minimum Time of the Day is "+mintime);
    }
}
