import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class BaseTest {

    protected WebDriver driver;


    @BeforeMethod
    public void setUp() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\agrebenkina\\IdeaProjects\\geckodriver-v0.19.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver. manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public  void tearDown(){
        driver.quit();
    }
}
