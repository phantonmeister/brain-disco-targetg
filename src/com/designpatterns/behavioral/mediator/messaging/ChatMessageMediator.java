package designpatterns.behavioral.mediator.messaging;

import java.util.ArrayList;
import java.util.List;

public class ChatMessageMediator implements MessageMediator{

    private List<User> users;

    public ChatMessageMediator(){
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User receivingUser : this.users){
            if(receivingUser != user)
                receivingUser.receiveMessage(message, user.name);
        }
    }

    @Override
    public void addUser(User user) {
        if(!users.contains(user))
            users.add(user);
    }
}
