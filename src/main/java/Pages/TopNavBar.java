package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopNavBar {
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-top-row\"]/div/div/div[2]/div[1]/a")
    WebElement homeIcon;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-bar\"]/div/div/div/a[1]")
    WebElement nyheter;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-bar\"]/div/div/div/a[2]")
    WebElement sport;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-bar\"]/div/div/div/a[3]")
    WebElement noje;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-bar\"]/div/div/div/a[4]")
    WebElement kultur;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-bar\"]/div/div/div/a[5]")
    WebElement ledare;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-bar\"]/div/div/div/a[6]")
    WebElement debatt;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-bar\"]/div/div/div/a[9]")
    WebElement senasteNytt;

    public void clickHomeIcon() {
        homeIcon.click();
    }
    public void clickNyheter() {
        nyheter.click();
    }
    public void clickSport() {
        sport.click();
    }
    public void clickNoje() {
        noje.click();
    }
    public void clickKultur() {
        kultur.click();
    }
    public void clickLedare() {
        ledare.click();
    }
    public void clickDebatt() {
        debatt.click();
    }
    public void clickSenasteNytt() {
        senasteNytt.click();
    }
}
