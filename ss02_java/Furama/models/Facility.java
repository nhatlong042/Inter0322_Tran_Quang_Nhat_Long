package models;

public abstract class Facility {
    private String id;
    private String name ; //tên dịch vụ
    private double usableArea; // diện tích sử dụng
    private int cost; // chi phí thuê dịch vụ
    private int maxQuantity; // số người tối đa
    private String rentalType; // kiểu thuê

    public Facility() {
    }

    public Facility(String id,String name, double usableArea, int cost, int maxQuantity, String rentalType) {
        this.id=id;
        this.name = name;
        this.usableArea = usableArea;
        this.cost = cost;
        this.maxQuantity = maxQuantity;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
    @Override
    public String toString()
    {
        return "ID: "+id+" Tên: " +name+" Diện tích sử dụng: " +  usableArea+" Giá tiền: "+  cost+" Số người tối đa: "
                + maxQuantity +" Kiểu thuê: "+rentalType;
    }
}
