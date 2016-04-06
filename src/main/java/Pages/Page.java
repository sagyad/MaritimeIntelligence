package Pages;

import Elements.HomePage_Elements;
import Utility.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by yadavs on 11/03/2016.
 */
public class Page {

    WebDriver Driver = Browser.driver(Browser.BrowserType.FIREFOX);

    public static String LLI_LIVE_URL = "www.lloydslistintelligence.com/llint";

    public void clearCookies() {
        Driver.manage().deleteAllCookies();
    }

    public void launch_LIVE_LLI_SITE() {
        Driver.manage().window().maximize();
        Driver.manage().deleteAllCookies();
        Driver.navigate().to(LLI_LIVE_URL);
        fluentWaitForFewSeconds(30);
    }

    public void explicitWaitForFewSeconds(int sec) {
        Driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }

    public void fluentWaitForFewSeconds(int sec) {
        Wait wait = new FluentWait(Driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchContextException.class);
    }

    public void verifyPageTitles(String pageTitle) {
        String title = Driver.getTitle();
        assertEquals(title, pageTitle);
    }

}
