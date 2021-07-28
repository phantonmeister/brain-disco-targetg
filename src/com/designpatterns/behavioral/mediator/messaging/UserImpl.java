package designpatterns.behavioral.mediator.messaging;

public class UserImpl extends   User{
    public UserImpl(MessageMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receiveMessage(String message, String name) {
        System.out.println("Recieved message with text for " +this.name+ " :"+message+ " from "+name);
    }

    @Override
    public void sendMessage(String message) {
        super.mediator.sendMessage(message, this);

    }
}
