package _21_Class.WaterBottle;

public class WaterBottle {
    int currentWater;

    WaterBottle(){
        System.out.println("현재 물의 양은 "+ currentWater+"입니다.");
    }
    public void fill(int plusWater){
        if(0<plusWater && plusWater<=1000){
            System.out.println(plusWater+"만큼 물이 채워졌습니다.");
            currentWater+=plusWater;
        }
        else if(plusWater>1000){
            System.out.println("최대용량을 초과할 수 없습니다.");
        }
        else{
            System.out.println("현재 용량은 "+ currentWater+"입니다");
        }
    }
    public void drink(int drinkWater){
        if(drinkWater>=0 && drinkWater<=currentWater){
            System.out.println(drinkWater+"만큼 물을 마셨습니다");
            currentWater-=drinkWater;
        }
        else if(drinkWater>currentWater){
            System.out.println(drinkWater+"만큼 마실 물이 없습니다.");
        }
            System.out.println("남은 물은 "+currentWater+"만큼 남았습니다.");

    }
}
