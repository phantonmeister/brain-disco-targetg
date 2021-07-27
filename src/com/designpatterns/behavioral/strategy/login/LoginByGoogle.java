package designpatterns.behavioral.strategy.login;

public class LoginByGoogle implements Login{

    @Override
    public void login(String username) {
        System.out.println("Logging by Google for : "+username);
    }
}
