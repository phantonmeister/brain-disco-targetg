package designpatterns.behavioral.command.remotedevices;

public class TurnOnCommand implements Command{
    private Device device;
    public TurnOnCommand(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.turnOn();

    }
}