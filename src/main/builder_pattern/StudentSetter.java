package main.builder_pattern;

import lombok.Setter;
import lombok.ToString;

//@Setter
@ToString
public class StudentSetter
{
    
    private String name;
    private String email;
    private String phone;
    private String address;
    
    public StudentSetter () {
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    public void setPhone (String phone) {
        this.phone = phone;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
}
