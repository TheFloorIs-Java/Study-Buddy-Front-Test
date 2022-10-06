package StuddyBuddyFrontTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Main {

        public WebDriver driver;
        public WebDriver initializeDriver() throws IOException {
            Properties prop = new Properties();
            FileInputStream fis =new FileInputStream("C:\\Users\\HP\\Desktop\\RevatureProject2 Group\\StuddyBuddyFrontTest\\src\\main\\java\\StuddyBuddyFrontTest\\data.properties");
            prop.load(fis);
            String browserName = prop.getProperty("browser");
            if(browserName.equals("chrome")){
                System.setProperty("webdriver.chrome.driver",
                        "C:\\Users\\HP\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equals("firefox")) {

            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
        }
    }
