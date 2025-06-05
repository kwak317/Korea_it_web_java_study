package _34_Exception;

import java.util.Scanner;

public class DivideException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("숫자를 입력하세요 : ");
        a = scanner.nextInt();
        System.out.print("숫자를 입력하세요 : ");
        b = scanner.nextInt();

        try{
            int result = a / b;
            System.out.println("a와b를 나눈 값은 : " + result +"입니다.");
        }catch (Exception e){
            System.out.println("0으로는 나눌 수 없습니다.");
        }finally {
            System.out.println("프로그램 정상 종료");
        }

    }
}
