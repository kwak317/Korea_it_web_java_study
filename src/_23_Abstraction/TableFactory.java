package _23_Abstraction;

public class TableFactory extends Factory{
    private String tabletName;

    @Override
    public void produce(String model) {
        System.out.println(model);
        tabletName = model;
    }

    @Override
    public void manage() {
        System.out.println("아이패드를 업그레이드 합니다.");
    }


    public void upgrade(String model){
        System.out.println(tabletName +"에서 "+model+"로 업그레이드 되었습니다.");
    }

}
