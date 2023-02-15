package Domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UtorakObaPogresna {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/");

        WebElement practice = driver.findElement(By.id("menu-item-20"));
        practice.click();

        WebElement testLogin = driver.findElement(By.linkText("Test Login Page"));
        testLogin.click();

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("123");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        String expectedURL = "https://practicetestautomation.com/practice-test-login/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

        WebElement pageText = driver.findElement(By.id("error"));
        Assert.assertTrue(pageText.isDisplayed());

    }
}
