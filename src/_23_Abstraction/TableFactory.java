package _23_Abstraction;

public class TableFactory extends Factory{
    private String tabletname;

    @Override
    public void produce(String model) {
        System.out.println(model);
        tabletname = model;
    }

    @Override
    public void manage() {
        System.out.println("아이패드를 업그레이드 합니다.");
    }


    public void upgrade(String model){
        System.out.println(tabletname +"에서 "+model+"로 업그레이드 되었습니다.");
    }

}
