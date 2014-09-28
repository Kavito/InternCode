package Model;
// Generated 25-09-2014 12:03:49 by Hibernate Tools 3.6.0



/**
 * Company generated by hbm2java
 */
public class Company  implements java.io.Serializable {


     private int companyId;
     private String companyName;
     private String companyAddress;
     private String companyPhone;
     private String companyEmail;
     private String companyIndustry;

    public Company() {
    }

	
    public Company(int companyId) {
        this.companyId = companyId;
    }
    public Company(int companyId, String companyName, String companyAddress, String companyPhone, String companyEmail, String companyIndustry) {
       this.companyId = companyId;
       this.companyName = companyName;
       this.companyAddress = companyAddress;
       this.companyPhone = companyPhone;
       this.companyEmail = companyEmail;
       this.companyIndustry = companyIndustry;
    }
   
    public int getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCompanyAddress() {
        return this.companyAddress;
    }
    
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
    public String getCompanyPhone() {
        return this.companyPhone;
    }
    
    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }
    public String getCompanyEmail() {
        return this.companyEmail;
    }
    
    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }
    public String getCompanyIndustry() {
        return this.companyIndustry;
    }
    
    public void setCompanyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry;
    }




}


