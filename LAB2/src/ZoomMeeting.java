public class ZoomMeeting extends MeetingRoom {
    private String deviceId;
    private String accountId;
    public ZoomMeeting(String deviceId,String accountId,String roomName, int roomCapacity, int floor){
        super(roomName,roomCapacity,floor);
        this.deviceId=deviceId;
        this.accountId=accountId;

    }
    public String getDeviceId(){
        return deviceId;
    }
    public String getAccountId(){
        return accountId;
    }

}
