package designpatterns.behavioral.command.remotedevices;

public class TurnOffCommand implements Command{

    private Device device;
    public TurnOffCommand(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.turnOff();

    }
}
