package designpatterns.behavioral.command;

public class CommandMain {

    public static void main(String... args){

        RemoteControlDevice remoteControlDevice = new RemoteControlDevice();
        remoteControlDevice.getLightBulbOnButton().pressButton();
        remoteControlDevice.getLightBulbOffButton().pressButton();

    }
}
