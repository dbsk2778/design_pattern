package main.builder_pattern;

import lombok.ToString;

//@Builder
@ToString
public class StudentBuilder
{
    
    private String name;
    private String email;
    private String phone;
    private String address;
    
    public StudentBuilder () {
    }

    public StudentBuilder (
        String name,
        String email,
        String phone,
        String address
    ) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    
    public StudentBuilder name (String name) {
        this.name = name;
        return this;
    }
    
    public StudentBuilder email (String email) {
        this.email = email;
        return this;
    }
    
    public StudentBuilder phone (String phone) {
        this.phone = phone;
        return this;
    }
    
    public StudentBuilder address (String address) {
        this.address = address;
        return this;
    }
    
    public StudentBuilder build() {
        return new StudentBuilder(
            name,
            email,
            phone,
            address
        );
    }
    
}
