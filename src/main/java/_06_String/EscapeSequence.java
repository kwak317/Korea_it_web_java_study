package _06_String;

public class EscapeSequence {
    public static void main(String[] args) {
        //특수만자, 이스케이프 문자
        // \n , \t . \\ . \", \'
        System.out.println("집에");
        System.out.println("너무");
        System.out.println("가고싶어요");

        // \n => new line
        System.out.println("집에\n너무\n가고싶어요");

        // \t => tab (스페이스바 4칸 띄움)
        /*
            손흥민
            페이커
            방탄소년단
            블랙핑크
        * */
        System.out.println("\t손흥민");
        System.out.println("\t페이커");
        System.out.println("\t방탄소년단");
        System.out.println("\t블랙핑크");

        // \\
        // "C:\Program Files\java"
        System.out.println("C:\\Program Files\\java");

        // \"
        // 손흥민의 팀은 "토트넘 홋스퍼 Fc"이다.
        System.out.println("손흥민의 팀은 \"토트넘 홋스퍼 Fc\"이다.");

        // \'
        // 페이커는 '신'이다
        System.out.println("페이커는\'신\'이다");

        char c = 'A';
        c = '\'';
        System.out.println(c);

        //문제
        String id = "030418-3123456";
        //출력을 030418-1

        System.out.println(id.substring(0,8));
        System.out.println(id.substring(0,id.indexOf("-")+2));


    }
}
