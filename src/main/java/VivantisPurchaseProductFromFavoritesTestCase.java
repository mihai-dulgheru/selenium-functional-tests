import constants.WebDriverConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class VivantisPurchaseProductFromFavoritesTestCase {
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
        driver.get("https://www.vivantis.ro/");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//div[@id='modals']/div/div/div[3]/div/button[2]/div/span")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.linkText("Parfumuri")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div/div[4]/div/div/nav/div[2]/div[2]/ul/li/div/div/ul/li/div/div[3]/div/div[3]/ul/li[2]/a/span")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sortare'])[1]/following::*[name()='svg'][3]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='estimam pe 13.4. la Dv.'])[2]/following::*[name()='svg'][2]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Viva club'])[1]/following::*[name()='svg'][1]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("pMF094")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div[2]/div[2]/div/div/div[2]/div[3]/div[2]/div/div[4]/div/div/div/a/div[2]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div[2]/div[2]/div/div/div[2]/div[7]/button")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='estimam pe 13.4. la Dv.'])[60]/following::*[name()='svg'][2]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Viva club'])[1]/following::*[name()='svg'][2]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div[2]/div/div/div[5]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div/div/div/div")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div[2]/div/div/div[5]/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-firstname")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-firstname")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-firstname")).sendKeys("<delivery_firstname>");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-lastname")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-lastname")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-lastname")).sendKeys("<delivery_lastname>");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-street")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-street")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-street")).sendKeys("<delivery_street>");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-area")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-area")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-area")).sendKeys("<delivery_area>");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div[2]/div/div/div[5]/div/div/div[3]/div/div/div[2]/div/div/div[4]/div/div[2]/div/div/div/div/div/div[2]/div/div")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-city")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-city")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-city")).sendKeys("<delivery_city>");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div[2]/div/div/div[5]/div/div/div[3]/div/div/div[2]/div/div/div[5]/div/div[2]/div/div/div/div/div/div/div/div")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-zip-code")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-zip-code")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-zip-code")).sendKeys("<delivery_zip_code>");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-phone")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-phone")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-phone")).sendKeys("<delivery_phone>");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-email")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-email")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-email")).sendKeys("someone@example.com");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div[2]/button/div")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.quit();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
