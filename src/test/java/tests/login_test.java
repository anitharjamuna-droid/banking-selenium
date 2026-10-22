package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.login_pages;
import pages.DashboardPage;

public class login_test {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        login_pages loginPage = new login_pages(driver);

        loginPage.login("john", "demo");

        DashboardPage dashboardPage = new DashboardPage(driver);

        if (dashboardPage.isDashboardDisplayed()) {
            System.out.println("Login Test Passed");
        } else {
            System.out.println("Login Test Failed");
        }

        driver.quit();
    }
}