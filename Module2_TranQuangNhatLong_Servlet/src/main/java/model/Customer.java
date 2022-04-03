package model;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return getId() == customer.getId();
    }
}