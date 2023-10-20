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
    private Integer Phone;
    private String Password;
    private String Street;
    private String State;
    private String City;
    private String Country;
    private Integer Zip;

    public User() {

    }

    public User(String Name, String Mail, Integer Phone, String Password, String Street, String State, String City, String Country, Integer Zip) {
        this.Name = Name;
        this.Mail = Mail;
        this.Phone = Phone;
        this.Password = Password;
        this.Street = Street;
        this.State = State;
        this.City = City;
        this.Country = Country;
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

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer Phone) {
        this.Phone = Phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public Integer getZip() {
        return Zip;
    }

    public void setZip(Integer Zip) {
        this.Zip = Zip;
    }

    @Override
    public String toString() {
        return "User{" + "Name=" + Name + ", Mail=" + Mail + ", Phone=" + Phone + ", Password=" + Password + ", Street=" + Street + ", State=" + State + ", City=" + City + ", Country=" + Country + ", Zip=" + Zip + '}';
    }

}
