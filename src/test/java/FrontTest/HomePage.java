package FrontTest;

import StuddyBuddyFrontTest.Main;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPageTest;

import java.io.IOException;

public class HomePage extends Main {
    @Test
    public  void homePage() throws IOException, InterruptedException {
       driver =  initializeDriver();
       driver.get("http://localhost:4200/");
       driver.findElement(By.xpath("//a[contains(text(),'Login or Sign-up')]")).click();

       LoginPageTest lpt = new LoginPageTest(driver);
     lpt.logPage().sendKeys("mah");
     lpt.logPass().sendKeys("mah123");
     Thread.sleep(3000);
     lpt.logIn().click();
    }
}
