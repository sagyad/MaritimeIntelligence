package Utility;

import com.sun.imageio.plugins.wbmp.WBMPImageReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by yadavs on 11/03/2016.
 */
public class Browser {
    public static WebDriver firefoxDriver;
    public static WebDriver chromeDriver;
    public static WebDriver htmlDriver;

    public enum BrowserType {FIREFOX, CHROME, HTMLUNIT}

    public static WebDriver driver(BrowserType browserType) {

        switch (browserType) {

            case CHROME:
                if (chromeDriver == null) {
                    System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\driver\\chromedriver.exe");
                    chromeDriver = new ChromeDriver();
                }
                return chromeDriver;
            case HTMLUNIT:
                if (htmlDriver == null) htmlDriver = new HtmlUnitDriver();
                return htmlDriver;
            default:
                if (firefoxDriver == null) firefoxDriver = new FirefoxDriver();
                return firefoxDriver;
        }
    }
}
