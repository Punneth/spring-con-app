package conversion.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emply_mvc")
public class Employee {

    @Id
    private int empId;
    private String username;
    private String email;
    private String password;

    public Employee() {
        super();
    }

    public Employee(int empId, String username, String email, String password) {
        super();
        this.empId = empId;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", username=" + username + ", email=" + email + ", password=" + password
                + "]";
    }

}
