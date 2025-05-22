package _19_VariableScope;

public class VariableScope {
    public static void methodA(){
        String str = "abc";
//        System.out.println(name);
    }
    public static void main(String[] args) {
        String name = "곽호준";

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        {
            int age = 23;
        }
//        System.out.println(age);
    }
}
