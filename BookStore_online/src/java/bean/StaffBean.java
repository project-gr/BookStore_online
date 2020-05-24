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
public class StaffBean {
    private String Staff_ID;
    private String Staff_name;
    private String Staff_username;
    private String Staff_password;
    private String Phone;
    private String Email;

    public StaffBean() {
    }

    public StaffBean(String Staff_ID, String Staff_name, String Staff_username, String Staff_password, String Phone, String Email) {
        this.Staff_ID = Staff_ID;
        this.Staff_name = Staff_name;
        this.Staff_username = Staff_username;
        this.Staff_password = Staff_password;
        this.Phone = Phone;
        this.Email = Email;
    }

    public String getStaff_ID() {
        return Staff_ID;
    }

    public void setStaff_ID(String Staff_ID) {
        this.Staff_ID = Staff_ID;
    }

    public String getStaff_name() {
        return Staff_name;
    }

    public void setStaff_name(String Staff_name) {
        this.Staff_name = Staff_name;
    }

    public String getStaff_username() {
        return Staff_username;
    }

    public void setStaff_username(String Staff_username) {
        this.Staff_username = Staff_username;
    }

    public String getStaff_password() {
        return Staff_password;
    }

    public void setStaff_password(String Staff_password) {
        this.Staff_password = Staff_password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
