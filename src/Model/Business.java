/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Objects;

/**
 *
 * @author Rudi
 */
public class Business {
    
    int authority;
    String userName;
    String userPassword;
    String name;
    int yearofestablishment;
    String address;
    int phone;
    String email;
    String industry; //possbilly category
    int totalNumberOfEmployees;
   
    Business(){}

    public Business(int authority, String userName, String userPassword, String name, int yearofestablishment, String address, int phone, String email, String industry, int totalNumberOfEmployees) {
        this.authority = authority;
        this.userName = userName;
        this.userPassword = userPassword;
        this.name = name;
        this.yearofestablishment = yearofestablishment;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.industry = industry;
        this.totalNumberOfEmployees = totalNumberOfEmployees;
    }

    public int getAuthority() {
        return authority;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getName() {
        return name;
    }

    public int getYearofestablishment() {
        return yearofestablishment;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getIndustry() {
        return industry;
    }

    public int getTotalNumberOfEmployees() {
        return totalNumberOfEmployees;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearofestablishment(int yearofestablishment) {
        this.yearofestablishment = yearofestablishment;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setTotalNumberOfEmployees(int totalNumberOfEmployees) {
        this.totalNumberOfEmployees = totalNumberOfEmployees;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.authority;
        hash = 59 * hash + Objects.hashCode(this.userName);
        hash = 59 * hash + Objects.hashCode(this.userPassword);
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.yearofestablishment;
        hash = 59 * hash + Objects.hashCode(this.address);
        hash = 59 * hash + this.phone;
        hash = 59 * hash + Objects.hashCode(this.email);
        hash = 59 * hash + Objects.hashCode(this.industry);
        hash = 59 * hash + this.totalNumberOfEmployees;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Business other = (Business) obj;
        if (this.authority != other.authority) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.userPassword, other.userPassword)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.yearofestablishment != other.yearofestablishment) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (this.phone != other.phone) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.industry, other.industry)) {
            return false;
        }
        if (this.totalNumberOfEmployees != other.totalNumberOfEmployees) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Business{" + "authority=" + authority + ", userName=" + userName + ", userPassword=" + userPassword + ", name=" + name + ", yearofestablishment=" + yearofestablishment + ", address=" + address + ", phone=" + phone + ", email=" + email + ", industry=" + industry + ", totalNumberOfEmployees=" + totalNumberOfEmployees + '}';
    }
    
    
    
}
