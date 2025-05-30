package _20_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner => 입력
        Scanner scanner = new Scanner(System.in);
        //String 문자열 입력받기
        //next() => 토큰 단위로 읽는다.
        //토큰 : 공백문자(띄어쓰기,탭,엔터)
        //nextLine() => 엔터가 입력될때까지

//        String str1 = scanner.next();
//        String str2  = scanner.next();
//        System.out.println("str1은 "+str1);
//        System.out.println("str2은 "+str2);

//        String str3 = scanner.nextLine();
//        System.out.println("str3는 " + str3);

        //int 정수 입력받기
        //nextInt()
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println("num1은 "+ num1);
//        System.out.println("num2은 "+ num2);

//        int num = scanner.nextInt();
//        scanner.nextLine();
//        String str = scanner.nextLine();
//        System.out.println("num은 " +num + "이고 " +"str은 " + str +"이다");
//
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        String name = scanner.nextLine();
//        System.out.println("나이는 " + age + "이고 " + "이름은 "+ name +"이다.");
        int age;
        String name;

        System.out.print("나이를 입력해주세요>>>>");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이름을 입력해주세요>>>>");
        name = scanner.nextLine();
        System.out.println("나이는 " + age + "이고 " + "이름은 "+ name +"이다.");









    }
}
