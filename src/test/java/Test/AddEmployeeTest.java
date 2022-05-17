package Test;

import Pages.EmployeeSearchPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddEmployeeTest extends CommonMethods {
    @Test
    public void addEmployee(){
      //  login.usernameBox.sendKeys(ConfigReader.getPropertyValue("username"));
      //  login.passwordBox.sendKeys(ConfigReader.getPropertyValue("password"));
      //  login.loginBtn.click();

          login.loginMethod(ConfigReader.getPropertyValue("username"),
                  ConfigReader.getPropertyValue("password"));

        click(dash.pimOption);
        click(dash.addEmployeeButton);
        sendText(addEmployeePage.firstNameField,"Teyfur");
        sendText(addEmployeePage.lastNameField,"Asel");
        sendText(addEmployeePage.middleNameField,"Isak");

      String empId = addEmployeePage.empIDLocator.getAttribute("value");

        click(addEmployeePage.saveButton);
        System.out.println(empId);

        click(dash.pimOption);
        click(dash.employeeListOption);
        sendText(employeeSearchPage.idField,empId);
        click(employeeSearchPage.searchButton);

        List<WebElement> rowData = employeeSearchPage.rowData;
        for (WebElement data:rowData){

            String actualData = data.getText();
            Assert.assertEquals(empId,actualData);
        }
    }
    @Test
    public void addMultipleEmployee(){

    }
}
