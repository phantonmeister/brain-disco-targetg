package designpatterns.behavioral.strategy.login;

public class LoginStrategy {

    private Login loginAccount;

    public LoginStrategy(Login login) {
        this.loginAccount = login;
    }

    public void loginUser(String userName){
        this.loginAccount.login(userName);
    }
}
