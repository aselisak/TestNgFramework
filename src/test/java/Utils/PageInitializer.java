package Utils;

import Pages.AddEmployeePage;
import Pages.DashboardPage;
import Pages.EmployeeSearchPage;
import Pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;
    public static EmployeeSearchPage employeeSearchPage;
    public static AddEmployeePage addEmployeePage;
    public static DashboardPage dash;


    public static void initializePageObjects(){
        login = new LoginPage();
        employeeSearchPage = new EmployeeSearchPage();
        addEmployeePage = new AddEmployeePage();
        dash = new DashboardPage();



    }
}
