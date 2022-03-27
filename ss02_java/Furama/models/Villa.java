package models;

public class Villa extends Facility{
    private String roomStandard;// tiêu chuẩn phòng
    private double poolArea; // diện tích hồ bơi
    private int floor; // số tầng

    public Villa() {
    }

    public Villa(String id,String name,
                 double usableArea,
                 int cost,
                 int maxQuantity,
                 String rentalType,
                 String roomStandard,
                 double poolArea,
                 int floor) {
        super(id,name, usableArea, cost, maxQuantity, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
    @Override
    public String toString()
    {
        return "Villa("+super.toString() +" Tiêu chuẩn phòng: "+roomStandard+" Diện tích hồ bơi: "+poolArea
                +" Số tầng: "+floor+")";
    }
}
