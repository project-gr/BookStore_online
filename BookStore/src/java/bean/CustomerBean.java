/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Ren
 */
public class CustomerBean {
    private String Customer_ID;
    private String Customer_Name;
    private String Cus_username;
    private String Cus_password;
    private String Address;
    private String Street;
    private String District;
    private String City;
    private String Country;
    private String Email;
    private String Phone;

    public CustomerBean() {
    }

    public CustomerBean(String Customer_ID, String Customer_Name, String Cus_username, String Cus_password, String Address, String Street, String District, String City, String Country, String Email, String Phone) {
        this.Customer_ID = Customer_ID;
        this.Customer_Name = Customer_Name;
        this.Cus_username = Cus_username;
        this.Cus_password = Cus_password;
        this.Address = Address;
        this.Street = Street;
        this.District = District;
        this.City = City;
        this.Country = Country;
        this.Email = Email;
        this.Phone = Phone;
    }

    public String getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(String Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String Customer_Name) {
        this.Customer_Name = Customer_Name;
    }

    public String getCus_username() {
        return Cus_username;
    }

    public void setCus_username(String Cus_username) {
        this.Cus_username = Cus_username;
    }

    public String getCus_password() {
        return Cus_password;
    }

    public void setCus_password(String Cus_password) {
        this.Cus_password = Cus_password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String District) {
        this.District = District;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    
}
