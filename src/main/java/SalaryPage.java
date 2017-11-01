import org.openqa.selenium.WebDriver;

public class SalaryPage {

    WebDriver driver;
    private static final String URL = "https://games.williamhill.com/#!/";

    public SalaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(URL);
    }
}
