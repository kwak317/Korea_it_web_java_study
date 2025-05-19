package _12_MultipleTable;

public class MultipleTable {
    public static void main(String[] args) {
        // 1~9단까지 출력하십시오
        // 1 X 3 = 3
        for (int i = 2; i <= 9 ; i++) {
            System.out.println("=="+i+"단==");
            for (int j = 2; j <=9 ; j++) {
                System.out.println(i+ "X" +j + "=" + (i*j) );
            }


        }
    }
}
