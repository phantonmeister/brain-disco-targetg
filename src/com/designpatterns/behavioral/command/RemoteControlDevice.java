package designpatterns.behavioral.command;

import java.util.List;

public class RemoteControlDevice {

    private RemoteButton lightBulbOnButton;
    private RemoteButton lightBulbOffButton;

    public RemoteControlDevice() {
        this.lightBulbOffButton =  new RemoteButton(new TurnOffCommand(new LightBulb()));
        this.lightBulbOnButton = new RemoteButton(new TurnOnCommand(new LightBulb()));
    }

    public RemoteButton getLightBulbOnButton() {
        return lightBulbOnButton;
    }

    public void setLightBulbOnButton(RemoteButton lightBulbOnButton) {
        this.lightBulbOnButton = lightBulbOnButton;
    }

    public RemoteButton getLightBulbOffButton() {
        return lightBulbOffButton;
    }

    public void setLightBulbOffButton(RemoteButton lightBulbOffButton) {
        this.lightBulbOffButton = lightBulbOffButton;
    }
}
