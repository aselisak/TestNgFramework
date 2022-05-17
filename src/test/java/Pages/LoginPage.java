package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends CommonMethods {
    @FindBy(id = "txtUsername")
    public WebElement usernameBox;

    @FindBy(name = "txtPassword")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnLogin']")
    public WebElement loginBtn;

    @FindBy(xpath="//*[@id=\"divLogo\"]/img")
    public  WebElement logo;

    @FindBy(id = "spanMessage")
    public WebElement errorMessage;

    @FindBy(xpath = "//span[text()='Username cannot be empty']")
    public WebElement userNameEmptyMsg;

    @FindBy(xpath = "//span[text()='Password cannot be empty']")
    public WebElement passwordEmptyMsg;

    public LoginPage() {
        PageFactory.initElements(driver, this);}

    public void loginMethod(String username,String password){
        sendText(usernameBox,username);
        sendText(passwordBox,password);
        loginBtn.click();
    }
}
