package reposity;

import model.Customer;
import model.Person;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerReposity {
    private static List<Customer> customerList = new ArrayList<>();
    private BaseReposity baseReposity = new BaseReposity();

    static {
        customerList.add(new Customer(1, "Long", "04/04/2000", "Male", 191910559, "0813479063", "tqnhatlong@gmail.com", "Diamond", "324 Hoang Van Thai"));
        customerList.add(new Customer(2, "Minh", "10/12/1978", "Male", 172918599, "0913451231", "minmin@gmail.com", "Gold", "123 Ton Duc Thang"));
        customerList.add(new Customer(3, "Tuan", "12/12/2005", "Male", 111160129, "0123124124", "tuan@gmail.com", "Silver", "12 Truong Chinh"));
        customerList.add(new Customer(4, "Tung", "03/03/2000", "Male", 198791059, "0934838112", "duytung@gmail.com", "Gold", "254 Nguyen Van Linh"));
        customerList.add(new Customer(5, "Vy", "04/07/2001", "Female", 143421059, "0914324234", "trannguyentuongvy@gmail.com", "Diamond", "06 Do Ba"));
        customerList.add(new Customer(6, "Anh", "12/07/2002", "Female", 214123159, "0912124234", "anhanh@gmail.com", "Platinum", "03 Quang Trung"));
    }

    public List<Customer> getCustomerList() {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseReposity
                    .getConnection().prepareStatement("select * from khach_hang");
            Customer customer;
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("ma_khach_hang");
                String name = resultSet.getString("ho_ten");
                String dateOfbirth = resultSet.getString("ngay_sinh");
                String gender = resultSet.getString("gioi_tinh");
                int cmnd = resultSet.getInt("so_cmnd");
                String phone = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String type = resultSet.getString("ma_loai_khach");
                String address = resultSet.getString("dia_chi");
                customer = new Customer(id, name, dateOfbirth, gender, cmnd, phone, email, type, address);
                customerList.add(customer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public void addCustomer(Customer customer) {
        try {
            PreparedStatement preparedStatement = this.baseReposity
                    .getConnection()
                    .prepareStatement("insert into khach_hang(ma_khach_hang, ho_ten, ngay_sinh, gioi_tinh, so_cmnd, so_dien_thoai, email, ma_loai_khach, dia_chi) value(?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, customer.getId());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setString(3, customer.getDateOfbirth());
            preparedStatement.setString(4, customer.getGender());
            preparedStatement.setInt(5, customer.getCmnd());
            preparedStatement.setString(6, customer.getPhone());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getType());
            preparedStatement.setString(9, customer.getAddress());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Integer getIdMax() {
        int id = 0;
        try {
            PreparedStatement preparedStatement = this.baseReposity.getConnection().prepareStatement("select Max(ma_khach_hang) from khach_hang");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

}
