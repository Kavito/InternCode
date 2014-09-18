/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Rudi
 */
public class School {
 
    int authority;
    String userName;
    String userPassword;
    String name;
    String address;
    int phone;
    String email;
    String linesofEducation;
    int totalNumberOfStudents;

    public School(int authority, String userName, String userPassword, String name, String address, int phone, String email, String linesofEducation, int totalNumberOfStudents) {
        this.authority = authority;
        this.userName = userName;
        this.userPassword = userPassword;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.linesofEducation = linesofEducation;
        this.totalNumberOfStudents = totalNumberOfStudents;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinesofEducation() {
        return linesofEducation;
    }

    public void setLinesofEducation(String linesofEducation) {
        this.linesofEducation = linesofEducation;
    }

    public int getTotalNumberOfStudents() {
        return totalNumberOfStudents;
    }

    public void setTotalNumberOfStudents(int totalNumberOfStudents) {
        this.totalNumberOfStudents = totalNumberOfStudents;
    }
   
}
