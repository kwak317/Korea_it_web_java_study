package _24_Interface;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChanelUpButton(),
                new VolumeUpButton(),
                new ChanelDownButton(),
                new VolumeDownButton()
        );
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChanelUpButton();
        tvRemoteController.onPressedChanelDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onUpChanelUpButton();
        tvRemoteController.onDownChanelButton();
        tvRemoteController.onUpVolumeUpButton();
        tvRemoteController.onDownVolumeDownButton();

    }
}
