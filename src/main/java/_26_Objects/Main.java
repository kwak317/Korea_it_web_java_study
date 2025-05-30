package _26_Objects;

import _25_Casting.Control.Tv;

public class Main {
    public static void main(String[] args) {
        //모든 클래스는 Object 클래스를 상속받고 있다.

        Teacher teacher1 = new Teacher("이동윤","코리아it아카데미");
        Teacher teacher2 = new Teacher("이동윤","코리아it아카데미");
        System.out.println(teacher1.toString());
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
        System.out.println(teacher1.equals(teacher2));

    }
}
