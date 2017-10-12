package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserFactory {

    static WebDriver driver;
    public static final String BASE_URL = "https://www.aftonbladet.se/";

    public static WebDriver startBrowser(String browserName, String url)
    {
        if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
            driver=new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }
}
