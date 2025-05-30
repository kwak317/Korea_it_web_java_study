package _27_Bean;

//Bean
//하나의 객체 설계 규칙(명세, 가이드라인)
//맴버변수들은 private => 캡슐화
//기본 생성자
//getter setter 가 구현이 되있어야함. => 외부에서 접근하기 위해

public class UserEntity {
    private int userID;
    private String userName;
    private int age;
    private String email;

    public UserEntity() {
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity(" + "userId=" + userID
                +" ,userName=" +userName +
                " ,age=" +age +
                " ,email="+email +")";
    }
}
