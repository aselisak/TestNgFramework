package Test;

import Utils.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends CommonMethods {
    @Test
    public void logoIsPresent() {
        boolean isDisplayed = login.logo.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @DataProvider(name = "Credentials")
    public Object[][] data() {

        Object[][] loginData = {
                {"Admin", "abc", "Invalid credentials"},
                {"Admin", "xyz", "Invalid credentials"},
                {"Admin", "", "Password cannot be empty"},
                {"", "hum", "Username cannot be empty"}
        };
        return loginData;
    }
    @Test(dataProvider = "Credentials")
    public void invalidCredentials(String userName,String password, String errorMsg){
        login.usernameBox.sendKeys(userName);
        login.passwordBox.sendKeys(password);
        login.loginBtn.click();
        String Msg = login.errorMessage.getText();

        Assert.assertEquals(Msg,errorMsg);
    }
}




