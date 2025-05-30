package _23_Abstraction;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.setName("애플");
        phoneFactory.produce("아이폰16");
        phoneFactory.manage();

        TableFactory tableFactory = new TableFactory();
        tableFactory.setName("애플");
        tableFactory.produce("아이패드 6세대");
        tableFactory.upgrade("아이패드 7세대");
    }
}
