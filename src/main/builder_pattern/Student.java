package main.builder_pattern;

import lombok.ToString;

@ToString
public class Student
{
    
    // 점층적 생성자 패턴
    private String name;
    private String email;
    private String phone;
    private String address;
    
    // 모든 정보를 받는 생성자
    public Student(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    
    // 이름과 이메일만 받는 생성자
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
