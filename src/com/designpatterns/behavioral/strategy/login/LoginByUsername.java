package designpatterns.behavioral.strategy.login;

public class LoginByUsername implements Login{
    @Override
    public void login(String username) {
        System.out.println("Logging into account by username for : "+username);
    }
}
