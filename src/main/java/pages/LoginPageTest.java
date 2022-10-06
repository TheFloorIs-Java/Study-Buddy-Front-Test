package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageTest {
    public WebDriver driver;
    By LUser= By.xpath("//body/app-root[1]/app-log-in-page[1]/div[1]/div[1]/div[1]/input[1]");
    By Lpass = By.xpath("//body/app-root[1]/app-log-in-page[1]/div[1]/div[1]/div[2]/input[1]");
    By Bclick = By.xpath("//button[contains(text(),'Log In')]");

    public LoginPageTest(WebDriver driver2) {
        this.driver = driver2;

    }
    public WebElement logPage() {
        return driver.findElement(LUser);
    }
    public WebElement logPass() {
        return driver.findElement(Lpass);
    }
    public WebElement logIn() {
        return driver.findElement(Bclick);
    }



}
