package designpatterns.behavioral.mediator.messaging;

public interface MessageMediator {

    public void sendMessage(String message, User user);

    public void addUser(User user);
}
