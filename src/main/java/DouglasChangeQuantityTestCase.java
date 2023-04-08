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

import java.time.Duration;

public class DouglasChangeQuantityTestCase {
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
        driver.findElement(By.xpath("//div[@id='tns1-item2']/a/span")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div/ul/li/ul/li[2]/a")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[1]/div/div/div/div[1]/div/div/div/div/div/div/div/div/ul/li/ul/li[2]/ul/li[1]/a")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[3]/a")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//*[@id=\"productDetailPageBuyProductForm\"]/div/div/button")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.linkText("Vizualizare coș de cumpărături")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cantitate'])[2]/following::div[4]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cantitate'])[2]/following::span[6]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        new Select(driver.findElement(By.id("quantity-8007c96bb0374801923da23baea5d4ee"))).selectByVisibleText("2");
        Thread.sleep(WebDriverConstants.MILLIS);

        Assertions.assertEquals(driver.findElement(By.xpath("/html/body/main/div/div/div/div/div[1]/div[1]/div[1]/div/div/div")).getText().trim(), "Coșul de cumpărături actualizat");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
