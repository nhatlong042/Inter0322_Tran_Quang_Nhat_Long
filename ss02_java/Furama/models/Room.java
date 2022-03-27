package models;

public class Room extends Facility{
    private String freeService; //dịch vụ miễn phí đi kèm

    public Room() {
    }

    public Room(String id,String name,
                double usableArea,
                int cost,
                int maxQuantity,
                String rentalType,
                String freeService) {
        super(id,name, usableArea, cost, maxQuantity, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
