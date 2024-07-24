public class MeetingRoom {
    public String roomName;
    public int roomCapacity;
    private int floor;
    public MeetingRoom(String roomName, int roomCapacity, int floor) {
        this.roomName=roomName;
        this.roomCapacity=roomCapacity;
        this.floor=floor;
    }
    public String getRoomName() {
            return roomName;
    }
    public int getRoomCapacity(){
        return roomCapacity;
    }
    public int getFloor(){
        return floor;
    }


}
