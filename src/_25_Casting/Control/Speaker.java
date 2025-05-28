package _25_Casting.Control;

public class Speaker implements Power {
    @Override
    public void on() {
        System.out.println("스피커를 켭니다");
    }

    @Override
    public void off() {
        System.out.println("스피커를 끕니다");
    }
    public void controlVolume(){
        System.out.println("볼륨을 조절합니다.");
    }
}
