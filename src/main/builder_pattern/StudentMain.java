package main.builder_pattern;

public class StudentMain
{
    
    public static void main (String[] args) {
        // 점층적 생성자 패턴
        Student student = new Student(
            "이유나",
            "dbsk@naver.com",
            "010-1234-5678",
            "서울시 동작구"
        );
        System.out.println("점층적 생성자1: " + student.toString());
        
        // 이름과 이메일만 받는 생성자
        Student student2 = new Student(
            "이유나",
            "dbsk@naver.com"
        );
        System.out.println("점층적 생성자2: " + student2.toString());
        
        // Setter 사용 - 일관성과 불변성이 깨질 수 있음
        StudentSetter studentSetter = new StudentSetter();
        studentSetter.setName("이유나");
        studentSetter.setEmail("dbsk@naver.com");
        studentSetter.setPhone("010-1234-5678");
        studentSetter.setAddress("서울시 동작구");
        
        System.out.println("setter: " + studentSetter.toString());
        
        // Builder 사용
        StudentBuilder studentBuilder =  new StudentBuilder()
            .name("이유나")
            .email("dbsk@naver.com")
            .phone("010-1234-5678")
            .address("서울시 동작구")
            .build();
        
        System.out.println("빌더 패턴:" + studentBuilder.toString());
    }
    
}
