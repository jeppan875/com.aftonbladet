import Helpers.browserFactory;
import Pages.TopNavBar;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class navigationBarTest {

    @Test
    public void topNavBarTest() throws InterruptedException {

        WebDriver driver= browserFactory.startBrowser("firefox",browserFactory.BASE_URL);
        TopNavBar topNavBar = PageFactory.initElements(driver, TopNavBar.class);
        topNavBar.clickHomeIcon();
        topNavBar.clickNyheter();
        topNavBar.clickSport();
        topNavBar.clickNoje();
        topNavBar.clickKultur();
        topNavBar.clickLedare();
        topNavBar.clickDebatt();
        topNavBar.clickSenasteNytt();
        topNavBar.clickHomeIcon();

        driver.quit();
    }
}
