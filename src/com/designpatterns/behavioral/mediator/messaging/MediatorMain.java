package designpatterns.behavioral.mediator.messaging;

public class MediatorMain {

    public static void main(String... args){
        MessageMediator mediator = new ChatMessageMediator();
        User user1 = new UserImpl(mediator, "Mickey Mouse");
        User user2 = new UserImpl(mediator, "Minnie Mouse");
        User user3 = new UserImpl(mediator, "Pluto");

        //Add one by one or create a new method in mediator that takes a list of users.
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hello fam.");

    }
}
