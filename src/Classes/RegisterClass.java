package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ian
 */
public class RegisterClass {
    private String ID;
    private String LastName;
    private String FirstName;
    private String Username;
    private String Password;
    private String Age;
    private String Address;
    private String ContactNo;
    private String Gender;
    private String Usertype;

    public String getUsertype() {
        return Usertype;
    }

    public void setUsertype(String Usertype) {
        this.Usertype = Usertype;
    }
    
    public String getID()
    {
        return ID;
    }
    public void setID(String ID)
    {
        this.ID = ID;
    }
    public String getLastName()
    {
        return LastName;
    }
    public void setLastName(String LastName)
    {
        this.LastName = LastName;
    }
    public String getFirstName()
    {
        return FirstName;
    }
    public void setFirstName(String FirstName)
    {
        this.FirstName = FirstName;
    }
    public String getUsername()
    {
        return Username;
    }
    public void setUsername(String Username)
    {
        this.Username = Username;
    }
    public String getPassword()
    {
        return Password;
    }
    public void setPassword(String Password)    
    {
        this.Password = Password;
    }
    public String getAge()
    {
        return Age;
    }
    public void setAge(String Age)
    {
        this.Age = Age;
    }
    public String getAddress()
    {
        return Address;
    }
    public void setAddress(String Address)
    {
        this.Address = Address;
    }
    public String getContactNo()
    {
        return ContactNo;
    }
    public void setContactNo(String ContactNo)
    {
        this.ContactNo = ContactNo;
    }
    public String getGender()
    {
        return Gender;
    }
    public void setGender(String Gender)
    {
        this.Gender = Gender;
    }
}
