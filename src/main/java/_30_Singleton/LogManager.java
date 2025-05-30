package _30_Singleton;

public class LogManager {
    //싱글톤(singleton)
    //애플리케이션 전체에서 단 하나의 인스턴스를 공유하도록 하는 패턴
    //자원을 공유해야할때 => 설정파일
    //객체를 여러번 만들필요가 없고 한번만 만들고 재사용하는 경우
    private static LogManager instance;

    private LogManager(){} // 생성자를 private으로 막아서 외부에서 new

    public static LogManager getInstance(){
        if(instance == null ){ //정적 변수에 인스턴스가 있는지 확인
            instance = new LogManager(); // 없다면 최초 1회 객체 생성
        }
        return instance;
    }
    public void log(String message){
        System.out.println("LOG => " + message);

    }

}
