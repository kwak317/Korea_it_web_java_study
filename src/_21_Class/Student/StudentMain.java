package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("곽호준",23,"hojun6901@gmail.com","부산광역시...");
            student.setName("홍길동");

//        student.name = "곽호준";
//        student.age = 23;
//        student.email = "hojun6901@gmail.com";
//        student.address = "부산광역시...";

        System.out.println(student.getEmail());
        student.showInfo();



    }
}
