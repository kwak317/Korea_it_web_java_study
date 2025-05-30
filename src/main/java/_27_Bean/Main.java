package _27_Bean;

import _24_Interface.Up;

public class Main {
    public static void main(String[] args) {
        //UserEntity
        //UserId, username, age, email => private
        //기본 생성자 하나 만들기
        // getter / setter

        UserEntity userEntity = new UserEntity();
        userEntity.setUserID(1);
        userEntity.setUserName("곽호준");
        userEntity.setAge(23);
        userEntity.setEmail("hojun6901@gmail.com");

        System.out.println(userEntity);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(2);
        userEntityLombok.setUsername("홍길동");
        userEntityLombok.setAge(18);
        userEntityLombok.setEmail("gildong@gmail.com");

        System.out.println(userEntityLombok);
    }
}
