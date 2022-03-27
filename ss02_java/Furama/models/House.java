package models;

public class House extends Facility{
    private String roomStandard;// tiêu chuẩn phòng
    private int floor; // số tầng

    public House() {
    }

    public House(String id,String name,
                 double usableArea,
                 int cost,
                 int maxQuantity,
                 String rentalType,
                 String roomStandard,
                 int floor) {
        super(id,name, usableArea, cost, maxQuantity, rentalType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
