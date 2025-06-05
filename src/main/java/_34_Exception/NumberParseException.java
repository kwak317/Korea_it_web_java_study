package _34_Exception;

import java.util.Scanner;

public class NumberParseException {
    public static void main(String[] args) {
        String num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력하세요 >>");
        num = scanner.nextLine();

        try{
            int number = Integer.parseInt(num);
            System.out.println("입력한 숫자는 : " + number);
        }catch (Exception e){
            System.out.println("숫자가 아닌 값을 입력하셨습니다 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
