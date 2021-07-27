package designpatterns.behavioral.command.remotedevices;

public class RemoteButton {
    //* This can extend or inherit from a Button interface. Not doing it here for simplicity.

    private Command command;

    public RemoteButton(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
