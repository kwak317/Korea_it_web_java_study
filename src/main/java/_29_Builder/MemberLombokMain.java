package _29_Builder;

public class MemberLombokMain {
    public static void main(String[] args) {
        MemberLombok memberLombok = MemberLombok.builder()
                .age(23)
                .email("hojun6901@gmail.com")
                .name("곽호준")
                .build();

    }
}
