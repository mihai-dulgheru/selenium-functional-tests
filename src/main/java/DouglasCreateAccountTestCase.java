import constants.WebDriverConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import util.RandomString;

import java.time.Duration;

public class DouglasCreateAccountTestCase {
    private final String emailAddress = RandomString.randomAlphanumeric(10) + "@example.com";
    JavascriptExecutor js;
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty(WebDriverConstants.WEB_DRIVER_HTTP_FACTORY_KEY, WebDriverConstants.WEB_DRIVER_HTTP_FACTORY_VALUE);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        js = (JavascriptExecutor) driver;
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://www.douglas.ro/");
        Thread.sleep(WebDriverConstants.MILLIS);
        Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
        WebElement shadowHost = wait.until(driver -> driver.findElement(By.cssSelector("#usercentrics-root")));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        shadowRoot.findElement(By.cssSelector("#uc-center-container > div.sc-cCjUiG.gHlwwJ > div > div > div > button:nth-child(2)")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("accountWidget")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/a")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tip Client:*'])[1]/following::div[3]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tip Client:*'])[4]/following::span[2]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        new Select(driver.findElement(By.id("accountType"))).selectByVisibleText("Persoană fizică");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Apelativ:*'])[1]/following::div[3]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Doamna'])[2]/following::span[2]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        new Select(driver.findElement(By.id("personalSalutation"))).selectByVisibleText("Domnul");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("personalFirstName")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("personalFirstName")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("personalFirstName")).sendKeys("Mihai-Nicolae");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("personalLastName")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("personalLastName")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("personalLastName")).sendKeys("Dulgheru");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("personalMail")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("personalMail")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("personalMail")).sendKeys(emailAddress);
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("personalPassword")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("personalPassword")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("personalPassword")).sendKeys("Qwertyuiop1234567890!@#$%^&*()");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("billingAddressAddressStreet")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("billingAddressAddressStreet")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("billingAddressAddressStreet")).sendKeys("Bulevardul Iuliu Maniu 15H");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("billingAddressadditionaladdressfields_block")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("billingAddressAddressZipcode")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("billingAddressAddressZipcode")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("billingAddressAddressZipcode")).sendKeys("061075");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("billingAddressAddressCity")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("billingAddressAddressCity")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("billingAddressAddressCity")).sendKeys("Bucuresti");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Țară*'])[1]/following::div[4]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Selectează țara...'])[3]/following::span[1]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        new Select(driver.findElement(By.id("billingAddressAddressCountry"))).selectByVisibleText("România");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Județ*'])[1]/following::span[1]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='BRASOV'])[2]/following::span[1]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        new Select(driver.findElement(By.id("billingAddressAddressCountryState"))).selectByVisibleText("BUCURESTI");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("billingAddressAddressPhoneNumber")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("billingAddressAddressPhoneNumber")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("billingAddressAddressPhoneNumber")).sendKeys("0712345678");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div/div/div[2]/div/div/div/form/div[5]/button")).click();
        Thread.sleep(WebDriverConstants.MILLIS);

        Assertions.assertTrue(isElementPresent(By.xpath("/html/body/main/div[2]/div/div/div/div[2]/div[1]/div[1]/h1")));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
