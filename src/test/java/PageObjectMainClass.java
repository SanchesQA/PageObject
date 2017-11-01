import org.testng.annotations.Test;

public class PageObjectMainClass extends BaseTest{


    @Test
    public void pagObjectShowCase() throws Exception {
        SalaryPage  salaryPage = new SalaryPage(driver);
        salaryPage.open();



    }
}
