package _21_Class.Student;

public class Student {
    private String name;
    private int age;
    private String email;
    private String address;

    //private 일때 값을 넣는 방법
    //1. 생성자
    //2. setter


    public Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //getter


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void showInfo(){
        System.out.println("이름은 "+name+"이고 "+"나이는 "+age+"이며 "+"이메일은 "+ email+"이고 "+"주소는 "+address+"이다.");
    }
}
