
package org.halls.business;


public class Mason {
    private String fname;
    private String lname;
    private String uname;
    private String staffNo;
    private String phoneNumber;
    private String password;
    
    public Mason() {
    }

    
    public Mason(String fname,String lname,  String uname,String staffNo,
   String phoneNumber, String password)
    {
        this.fname=fname;
        this.lname=lname;
        this.uname=uname;
        this.staffNo=staffNo;
        this.phoneNumber=phoneNumber;
        this.password=password;
    }

   
    public String getFname() {
        return fname;
    }

    
    public void setFname(String fname) {
        this.fname = fname;
    }

   
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
