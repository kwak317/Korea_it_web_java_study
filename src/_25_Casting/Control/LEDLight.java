package _25_Casting.Control;

public class LEDLight implements Power {
    @Override
    public void on() {
        System.out.println("불을 켭니다");
    }

    @Override
    public void off() {
        System.out.println("불을 끕니다");
    }
    public void changeColor(){
        System.out.println("전구의 색상을 바꿉니다.");
    }
}
