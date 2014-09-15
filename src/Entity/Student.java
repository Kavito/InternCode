package Entity;
// Generated 15-09-2014 10:45:52 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Student generated by hbm2java
 */
public class Student  implements java.io.Serializable {


     private Integer studentId;
     private String studentName;
     private String studentAge;
     private String studentAddress;
     private String studentPhone;
     private String studentEmail;
     private String studentNationality;
     private String studentEducationLine;
     private String studentLanguage;
     private Date studentInternDate;
     private Date studentExamDate;

    public Student() {
    }

    public Student(String studentName, String studentAge, String studentAddress, String studentPhone, String studentEmail, String studentNationality, String studentEducationLine, String studentLanguage, Date studentInternDate, Date studentExamDate) {
       this.studentName = studentName;
       this.studentAge = studentAge;
       this.studentAddress = studentAddress;
       this.studentPhone = studentPhone;
       this.studentEmail = studentEmail;
       this.studentNationality = studentNationality;
       this.studentEducationLine = studentEducationLine;
       this.studentLanguage = studentLanguage;
       this.studentInternDate = studentInternDate;
       this.studentExamDate = studentExamDate;
    }
   
    public Integer getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return this.studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentAge() {
        return this.studentAge;
    }
    
    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }
    public String getStudentAddress() {
        return this.studentAddress;
    }
    
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    public String getStudentPhone() {
        return this.studentPhone;
    }
    
    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }
    public String getStudentEmail() {
        return this.studentEmail;
    }
    
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public String getStudentNationality() {
        return this.studentNationality;
    }
    
    public void setStudentNationality(String studentNationality) {
        this.studentNationality = studentNationality;
    }
    public String getStudentEducationLine() {
        return this.studentEducationLine;
    }
    
    public void setStudentEducationLine(String studentEducationLine) {
        this.studentEducationLine = studentEducationLine;
    }
    public String getStudentLanguage() {
        return this.studentLanguage;
    }
    
    public void setStudentLanguage(String studentLanguage) {
        this.studentLanguage = studentLanguage;
    }
    public Date getStudentInternDate() {
        return this.studentInternDate;
    }
    
    public void setStudentInternDate(Date studentInternDate) {
        this.studentInternDate = studentInternDate;
    }
    public Date getStudentExamDate() {
        return this.studentExamDate;
    }
    
    public void setStudentExamDate(Date studentExamDate) {
        this.studentExamDate = studentExamDate;
    }




}


