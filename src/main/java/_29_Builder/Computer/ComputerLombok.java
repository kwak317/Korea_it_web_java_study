package _29_Builder.Computer;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class ComputerLombok {
    private String cpu;
    private int ram;
    private int storage;
    private boolean hasWifi;
    private boolean hasBluetooth;

//    public void spec() {
//        System.out.println("CPU: " + cpu);
//        System.out.println("RAM: " + ram);
//        System.out.println("Storage: " + storage);
//        System.out.println("WIFI: " + (hasWifi ? "지원" : "미지원"));
//        System.out.println("Bluetooth: " + (hasBluetooth ? "지원" : "미지원"));
//    }
}
