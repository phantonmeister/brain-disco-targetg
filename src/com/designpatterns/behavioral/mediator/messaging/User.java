package designpatterns.behavioral.mediator.messaging;

public abstract class User {

    protected MessageMediator mediator;
    protected String name;

    public User(MessageMediator mediator, String name){
        this.mediator =  mediator;
        this.name = name;
    }

    public abstract  void receiveMessage(String message, String senderName);
    public abstract  void sendMessage(String message);


}
