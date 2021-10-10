import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginForm extends PageObject{

    private final String USERNAME = "standard_user";
    private final String PASSWORD = "secret_sauce";
    private final String WRONG_PASSWORD = "1234";

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement login_button;

    @FindBy(xpath = "//h3[contains(text(),'Epic sadface: Username and password do not match any user in this service')]")
    private WebElement error_header;

    public LoginForm(WebDriver driver){
        super(driver);
    }

    public void enterUserName(){
        this.userName.sendKeys(USERNAME);
    }
    public void enterPassword(){
        this.password.sendKeys(PASSWORD);
    }
    public void enterWrongPassword(){
        this.password.sendKeys(WRONG_PASSWORD);
    }
    public void pressLoginButton(){
        this.login_button.click();
    }
    public String getErrorMessage(){


        return error_header.getText();
    }
}
