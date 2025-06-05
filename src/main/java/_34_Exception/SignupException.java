package _34_Exception;

import java.util.Scanner;

class SignupFailedException extends Exception{
    public SignupFailedException(String message){
        super(message);
        System.out.println("예외가 발생했습니다.");
    }
}
public class SignupException {
    public static void signUp(String name, int age) throws SignupFailedException{

        if (age < 14){
            throw new SignupFailedException("만 14세 미만 가입 불가");
        }
        System.out.println(name + "님 반갑습니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : " );
        String name = scanner.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = scanner.nextInt();

        try{
            signUp(name,age);
        } catch(SignupFailedException e){
            System.out.println(e.getMessage());
        }
    }
}
