
package org.halls.business;

public class Student {
    private String firstName;
    private String lastName;
    private String userName;
    private String regNo;
    private String hostel;
    private String block;
    private String roomNo;
    private String password;

    public Student() {
    }

    
    public Student(String firstName,String lastName,  String userName,String regNo,
   String hostel,String block,String roomNo, String password)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.hostel=hostel;
        this.block=block;
        this.regNo=regNo;
        this.roomNo=roomNo;
        this.password=password;
    }
  
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getHostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
          
    
}
