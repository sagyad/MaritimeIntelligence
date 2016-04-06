package Pages;

import Elements.HomePage_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

/**
 * Created by yadavs on 11/03/2016.
 */
public class HomePage extends Page {

    HomePage_Elements homePage_elements = new HomePage_Elements();
    WebElement element;

    public void validLoginWithVerification() {
        Driver.manage().deleteAllCookies();
        Driver.navigate().to(homePage_elements.LLI_LIVE_URL);
        fluentWaitForFewSeconds(30);
        Driver.manage().window().maximize();
        Driver.findElement(By.partialLinkText(homePage_elements.login_BYHREF)).click();
        explicitWaitForFewSeconds(5);
        Driver.findElement(By.id(homePage_elements.username_BYID)).sendKeys(homePage_elements.USERNAME);
        Driver.findElement(By.id(homePage_elements.password_BYID)).sendKeys(homePage_elements.PASSWORD);
        explicitWaitForFewSeconds(5);
        Driver.findElement(By.className(homePage_elements.loginButton_BYCLASSNAME)).click();
        explicitWaitForFewSeconds(5);
    }

    public void enterUsernameAndPassword(String username, String password) {
        explicitWaitForFewSeconds(5);
        Driver.findElement(By.partialLinkText(homePage_elements.login_BYHREF)).click();
        explicitWaitForFewSeconds(5);
        Driver.findElement(By.id(homePage_elements.username_BYID)).sendKeys(username);
        Driver.findElement(By.id(homePage_elements.password_BYID)).sendKeys(password);
        explicitWaitForFewSeconds(5);
    }

    public void clickOnLoginButton(String loginButton) {
        Driver.findElement(By.className(homePage_elements.loginButton_BYCLASSNAME)).click();
        explicitWaitForFewSeconds(10);
    }

    public void verifyLoginMessage(String message) {
        String welcomeMessage = Driver.findElement(By.xpath(homePage_elements.welcomeMessage_ByXPATH)).getText();
        assertEquals(welcomeMessage, message);
    }

    public void verifyInValidLoginMessage(String message) {
        String tMessage = Driver.findElement(By.xpath(homePage_elements.invalidLoginMessage_ByXPATH)).getText();
        String atoneLine = tMessage.toString().replaceAll("[\r\n]+", "");
        assertEquals(atoneLine, message);
    }

    public void navigateChannelPages(String channelPage) {
        Driver.findElement(By.partialLinkText(channelPage)).click();
    }
}
