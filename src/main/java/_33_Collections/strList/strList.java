package _33_Collections.strList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Collection
//여러 객체를 모아놓는것
//list => 순서가 있는 데이터의 집합
//ArrayList, LinkedList
public class strList {
    public static void main(String[] args) {
//        List <String> strList1 = new ArrayList<>();//방법1
//        //element 추가
//        strList1.add("A");
//        strList1.add("B");
//        strList1.add("A"); //중복허용

        //방법 2
        List<String> strList1 = new ArrayList<>(Arrays.asList("A","B","A"));

        List<String> strList2 = new ArrayList<>();
        strList2.add("java");
        strList2.add("python");
        strList2.add("C#");
        strList2.add("javascript");
        strList2.add("kotlin");

        String[] strArray = new String[2];
        strArray[0] = "이동윤";
        strArray[1] = "삼동윤";

        System.out.println(strArray);
        System.out.println(Arrays.toString(strArray));
        System.out.println(strList1);
        System.out.println(strList2);

        //특정 element의 포함여부 => contains()메소드 사용 -> return boolean
        String searchElem1 = "python";
        boolean isContains1 = strList2.contains(searchElem1);

        System.out.println(isContains1);

        String searchElem2 = "py";
        boolean isContains2 = strList2.contains(searchElem2);
        System.out.println(searchElem2 +"의 포함여부 : " + isContains2);

        String email = "test@gmail.com";
        boolean isContains3 = email.contains("@");
        System.out.println("@의 포함여부 : " + isContains3);
        //String의 경우 char들이 '순서대로' 나열된 것이기 때문에 char하나가 포함된 것을
        //contains로 부분검색이 가능하나
        //searchElem2의 경우는 element가 완전히 일치하는지를 확인하기 때문에
        //위와 같은 결과가 나온다











    }
}
