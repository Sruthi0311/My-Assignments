import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Duration;
public class EmployeeBooking {
    private String employeeId;
    private LocalDate meetingDate;
    private LocalTime meetingTime;
    private Duration duration;
    public ZoomMeeting zoomMeeting;
    public MeetingRoom meetingRoom;
    boolean ZoomCallingFacility;

    public EmployeeBooking(String employeeId,LocalDate meetingDate,LocalTime meetingTime,Duration duration,ZoomMeeting zoomMeeting){
        this.employeeId=employeeId;
        this.meetingDate=meetingDate;
        this.meetingTime=meetingTime;
        this.duration=duration;
        this.zoomMeeting=zoomMeeting;
        this.ZoomCallingFacility=true;
    }
    public EmployeeBooking(String employeeId,LocalDate meetingDate,LocalTime meetingTime,Duration duration,MeetingRoom meetingRoom){
        this.employeeId=employeeId;
        this.meetingDate=meetingDate;
        this.meetingTime=meetingTime;
        this.duration=duration;
        this.meetingRoom=meetingRoom;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public LocalTime getMeetingTime() {
        return meetingTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public ZoomMeeting getZoomMeeting() {
        return zoomMeeting;
    }

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public boolean ZoomCallingFacility() {
        return ZoomCallingFacility;
    }
}
