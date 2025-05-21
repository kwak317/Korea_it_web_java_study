package _18_OverLoading;

public class OverLoading {
    public static int getPower(int number){
        return number * number;
    }

    public static int getPower(double doubleNum){
        int number = (int) doubleNum;
        return  number*number;
    }

    public static int getPower(String strNum){
        int number = Integer.parseInt(strNum);
        return number * number;
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void printInFo(String name){
        System.out.println("곽호준");
    }
    public static void printInFo(String name, int age){
        System.out.println("곽호준"+"23");
    }
    public static void printInFo(String name, int age, String email){
        System.out.println("곽호준"+"23"+"hojun6901@gmail.com");
    }

    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러 개 선언
        //매개변수(파라미터)의 타입이 달라야 한다 또는 갯수가 달라야한다.
        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("4"));
        System.out.println(getPower(2,4));


        //문제
        //메소드 이름 printInFo()
        //문자열 이름만 전달 => 이름을 출력
        //문자열 이름, 정수 나이 전달 => 이름 나이 출력
        //문자열 이름, 정수 나이, 문자열 이메일 => 이름 나이 이메일 출력

        //메소드 이름 add()
        //int와 int의 덧셉
        //double과 double의 덧셈
        //문자열 숫자와 문자열 숫자의 덧셈

    }
}
