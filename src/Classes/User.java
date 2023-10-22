package Classes;

import java.io.Serializable;

/**
 * Class "User" which implements "Serializable" interface.
 *
 * @author Janam
 */
public class User implements Serializable {

    private String Name;
    private String Mail;
    private String Phone;
    private String Password;
    private String Address;
    private Integer Zip;

    public User() {

    }

    public User(String Name, String Mail, String Phone, String Password, String Address, Integer Zip) {
        this.Name = Name;
        this.Mail = Mail;
        this.Phone = Phone;
        this.Password = Password;
        this.Address = Address;
        this.Zip = Zip;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Integer getZip() {
        return Zip;
    }

    public void setZip(Integer Zip) {
        this.Zip = Zip;
    }

    @Override
    public String toString() {
        return "User{" + "Name=" + Name + ", Mail=" + Mail + ", Phone=" + Phone + ", Password=" + Password + ", Address=" + Address + ", Zip=" + Zip + '}';
    }

}
