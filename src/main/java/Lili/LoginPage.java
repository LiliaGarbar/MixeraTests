package Lili;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    private WebDriver driver;

    private final By fieldLogin = By.name("login");
    private final By fieldPass = By.name("password");
    private final By submitButton = By.xpath("//span[@id='button-2307-btnInnerEl']");

    public LoginPage enterLogin(String login){
        driver.findElement(fieldLogin).sendKeys(login);
        return this;
    }

    public LoginPage enterPassword(String password){
        driver.findElement(fieldPass).sendKeys(password);
        return this;
    }

    public LoginPage clickSubmit(){
        driver.findElement(submitButton).click();
        return this;
    }

    public LoginPage openLoginPage(){
        driver.get("https://www.4invest.net/ru/login.html");
        return this;
    }

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

}