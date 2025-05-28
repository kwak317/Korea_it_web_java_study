package _25_Casting.Control;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("컴퓨터를 킵니다");

    }

    @Override
    public void off() {
        System.out.println("컵퓨터를 끕니다.");
    }
    public void compute(){
        System.out.println("연산을 합니다.");
    }
}
