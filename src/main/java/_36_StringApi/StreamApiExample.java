package _36_StringApi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StreamApiExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> product = Arrays.asList(
                "애플 아이폰 15 Pro",
                "애플 맥북 프로 M3",
                "애플 아이패드 에어 5세대",
                "삼성 갤럭시 S24 울트라",
                "삼성 갤러시 Z플립 5",
                "삼성 갤럭시탭 S9",
                "엘지 울트라기어 게이밍 모니터");
        System.out.print("상품 브랜드를 입력하세요 : ");
        String brand1 = scanner.next();

        if(brand1.equalsIgnoreCase("apple")){
            brand1 = "애플";
        } else if (brand1.equalsIgnoreCase("samsung")) {
            brand1 = "삼성";
        } else if (brand1.equalsIgnoreCase("lg")) {
            brand1 = "엘지";
        }

        String keyword = brand1;

        List<String> brandName = product.stream()
                .filter(brand ->brand.contains(keyword))
                .toList();

        if(brandName.isEmpty()){
            System.out.println("해당 브랜드의 상품이 없습니다.");
        }else{
            brandName.forEach(System.out::println);
        }

    }
}
