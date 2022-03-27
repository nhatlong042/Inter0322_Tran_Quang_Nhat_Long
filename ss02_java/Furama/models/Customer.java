package models;

import java.util.Date;

public class Customer extends Person{
    private String type;
    private String address;

    public Customer() {
    }

    public Customer(int id,
                    String name,
                    String dateOfbirth,
                    String gender,
                    int cmnd,
                    String phone,
                    String email,
                    String type,
                    String address) {
        super(id, name, dateOfbirth, gender, cmnd, phone, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString()
    {
        return "Customer("+super.toString() +" Loại khách hàng: "+type+" Địa chỉ: "+address+")";
    }
}
