package _35_Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LambdaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> stringMap = new HashMap<>();

        System.out.print("상품갯수를 입력해주세요>>");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
//            System.out.print("상품명과 가격을 입력해주세요>>");
//            stringMap.put(scanner.next(),scanner.nextInt());
            System.out.print("상품명 : ");
            String name = scanner.nextLine();

            System.out.print("가격 : ");
            int price = scanner.nextInt();
            scanner.nextLine();

            stringMap.put(name,price);
        }
        System.out.println("[상품목록]");
        stringMap.forEach((name,price) ->
                System.out.println("상품명 : " +name + "가격 : " + price + "원"));
    }
}
