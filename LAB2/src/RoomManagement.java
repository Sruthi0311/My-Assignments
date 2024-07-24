import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Duration;
import java.util.Scanner;
public class RoomManagement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MeetingRoom room1 = new MeetingRoom("Premium1", 4, 3);
        MeetingRoom room2 = new MeetingRoom("Premium2", 3, 4);
        ZoomMeeting room3 = new ZoomMeeting("zoom12", "ZM12", "Premium3", 4, 5);
        ZoomMeeting room4 = new ZoomMeeting("zoom13", "ZM13", "Deluxe4", 5, 6);

        EmployeeBooking booking1 = new EmployeeBooking("Sruthi03", LocalDate.of(2024, 07, 02), LocalTime.of(1, 30), Duration.ofHours(1), room1);
        EmployeeBooking booking2 = new EmployeeBooking("Sameera31", LocalDate.of(2024, 07, 11), LocalTime.of(1, 20), Duration.ofMinutes(30), room2);
        EmployeeBooking booking3 = new EmployeeBooking("Priya14", LocalDate.of(2024, 07, 15), LocalTime.of(1, 45), Duration.ofMinutes(45), room3);
        EmployeeBooking booking4 = new EmployeeBooking("Mikkalya06", LocalDate.of(2024, 07, 17), LocalTime.of(1, 25), Duration.ofMinutes(25), room4);

        System.out.println("Booking 1: "+booking1.getMeetingRoom().getRoomName()+" "+booking1.getMeetingRoom().getRoomCapacity()+" "+booking1.getMeetingRoom().getFloor()+" "+booking1.getEmployeeId()+" "+booking1.getMeetingDate()+" "+booking1.getMeetingDate()+" "+booking1.getMeetingTime()+" "+booking1.getDuration());
        System.out.println("Booking 2: "+booking2.getMeetingRoom().getRoomName()+" "+booking2.getMeetingRoom().getRoomCapacity()+" "+booking2.getMeetingRoom().getFloor()+" "+booking2.getEmployeeId()+" "+booking2.getMeetingDate()+" "+booking2.getMeetingDate()+" "+booking2.getMeetingTime()+" "+booking2.getDuration());
        System.out.println("Booking 3: "+booking3.getZoomMeeting().getRoomName()+" "+booking3.getZoomMeeting().getRoomCapacity()+" "+booking3.getZoomMeeting().getFloor()+" "+booking3.getZoomMeeting().getAccountId()+" "+booking3.getZoomMeeting().getDeviceId()+" "+booking3.getEmployeeId()+" "+booking3.getMeetingDate()+" "+booking3.getMeetingDate()+" "+booking3.getMeetingTime()+" "+booking3.getDuration());
        System.out.println("Booking 4: "+booking4.getZoomMeeting().getRoomName()+" "+booking4.getZoomMeeting().getRoomCapacity()+" "+booking4.getZoomMeeting().getFloor()+" "+booking4.getZoomMeeting().getAccountId()+" "+booking4.getZoomMeeting().getDeviceId()+" "+booking4.getEmployeeId()+" "+booking4.getMeetingDate()+" "+booking4.getMeetingDate()+" "+booking4.getMeetingTime()+" "+booking4.getDuration());
    }
}