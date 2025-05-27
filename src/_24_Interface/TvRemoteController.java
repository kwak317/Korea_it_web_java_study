package _24_Interface;

public class TvRemoteController {

    private PowerButton powerButton;
    private ChanelUpButton chanelUpButton;
    private ChanelDownButton chanelDownButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public TvRemoteController(PowerButton powerButton, ChanelUpButton chanelUpButton, VolumeUpButton volumeUpButton, ChanelDownButton chanelDownButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.chanelUpButton = chanelUpButton;
        this.volumeUpButton = volumeUpButton;
        this.chanelDownButton = chanelDownButton;
        this.volumeDownButton = volumeDownButton;
    }

    public void onPressedPowerButton(){
        System.out.print("TV의 ");
        powerButton.onPressed();
    }
    public void onPressedChanelUpButton(){
        System.out.print("TV의 ");
        chanelUpButton.onPressed();
    }
    public void onPressedChanelDownButton(){
        System.out.print("TV의 ");
        chanelDownButton.onPressed();
    }
    public void onPressedVolumeUpButton(){
        System.out.print("TV의 ");
        volumeUpButton.onPressed();
    }
    public void onPressedVolumeDownButton(){
        System.out.print("TV의 ");
        volumeDownButton.onPressed();
    }
    public void onUpChanelUpButton(){
        System.out.print("TV의 ");
        chanelUpButton.onUp();
    }
    public void onDownChanelButton(){
        System.out.print("TV의 ");
        chanelDownButton.onDown();
    }
    public void onUpVolumeUpButton(){
        System.out.print("TV의 ");
        volumeUpButton.onUp();
    }
    public void onDownVolumeDownButton(){
        System.out.print("TV의 ");
        volumeDownButton.onDown();
    }
}
