package _25_Casting.Control;

public class Tv implements Power{
    @Override
    public void off() {
        System.out.println("TV의 전원을 끕니다");

    }

    @Override
    public void on() {
        System.out.println("TV의 전원을 켭니다");

    }
    public void changeChanel(){
        System.out.println("채널을 바꿉니다.");
    }
}

