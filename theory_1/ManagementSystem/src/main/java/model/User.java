package model;
import java.util.Date;

public class UserDao {
    protected int id;
    protected String name;
    protected String email;
    protected String mobilePhone;
    protected boolean isActive;
    protected Date dateCreated;

    // Constructor with all variables
    public UserDao(int id, String name, String email, String mobilePhone, boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.isActive = isActive;
        dateCreated = new Date();
    }

    // Constructor with no variables (default constructor)
    public UserDao() {
        dateCreated = new Date();
        // You can initialize variables with default values here if needed

    }

    // Getter and setter methods for all variables

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
