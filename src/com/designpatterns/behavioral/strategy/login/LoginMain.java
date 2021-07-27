package designpatterns.behavioral.strategy.login;

public class LoginMain {

    public static void main(String... args){

        LoginStrategy loginStrategy = new LoginStrategy(new LoginByGoogle());
        loginStrategy.loginUser("someusername");
    }
}
