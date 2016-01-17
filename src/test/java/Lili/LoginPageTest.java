package Lili;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class LoginPageTest {
    private FirefoxDriver driver;
    private LoginPage loginPage;


    @Before
    public void precondition() {
        driver = new FirefoxDriver();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void loginTest() {
        loginPage.openLoginPage()
                .enterLogin("login")
                .enterPassword("password")
                .clickSubmit();



        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='toolbarAvatar']")).isDisplayed());


    }

    @After
    public void postcondition() {
        driver.manage().deleteAllCookies();
        driver.quit();

    }
}

