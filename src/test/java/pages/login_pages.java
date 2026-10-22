package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_pages {

    WebDriver driver;

    By username = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath("//input[@value='Log In']");

    public login_pages(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(By.className("error")).isDisplayed();
    }
}