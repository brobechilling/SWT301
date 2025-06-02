package QuocDE190667;

public class AccountService {

    private static final String EMAIL_REGEX = "^\\w+@\\w+(\\.[a-zA-Z]+)+$";

    public boolean registerAccount(String username, String password, String email)
    {
        return username != null && !username.isEmpty()
                && password != null && !password.isEmpty() && password.length()>6
                && email != null && !email.isEmpty() && isValidEmail(email);
    }

    public boolean isValidEmail(String email)
    {
        return email.matches(EMAIL_REGEX);
    }
}
