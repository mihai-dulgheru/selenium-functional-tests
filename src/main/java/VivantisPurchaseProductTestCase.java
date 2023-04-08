import constants.WebDriverConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class VivantisPurchaseProductTestCase {
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
        driver.findElement(By.id("fulltext-desktop")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("fulltext-desktop")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("fulltext-desktop")).sendKeys("dior");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div/div[3]/div/div[2]/form/div[2]/div[2]/button/div/span")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("pCI174")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div[2]/div[2]/div/div/div[2]/div[3]/div[2]/div/div[4]/div/div/div[2]/a/div[4]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div[2]/div[2]/div/div/div[2]/div[6]/button/div/span")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.cssSelector("div.position-absolute.right-3.top-3 > button.base-button.icon-button.medium.shadow > div.d-flex.align-items-center.justify-content-center > svg.icon > use")).click();
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
        driver.findElement(By.id("delivery-firstname")).sendKeys("Claudiu-Adrian");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-lastname")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-lastname")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-lastname")).sendKeys("Comorasu");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-street")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-street")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-street")).sendKeys("Martir Crisan");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-area")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-area")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-area")).sendKeys("Baca");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div[2]/div/div/div[5]/div/div/div[3]/div/div/div[2]/div/div/div[4]/div/div[2]/div/div/div/div/div/div/div/div")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-city")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-city")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-city")).sendKeys("Ba");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div[2]/div/div/div[5]/div/div/div[3]/div/div/div[2]/div/div/div[5]/div/div[2]/div/div/div[4]/div/div/div/div[2]/div/div/div/div")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-zip-code")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-zip-code")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-zip-code")).sendKeys("600021");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-phone")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-phone")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-phone")).sendKeys("0755176277");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-email")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-email")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("delivery-email")).sendKeys("comorasuclaudiu19@stud.ase.ro");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("//main[@id='app']/div/div[2]/div/div/div[5]/div/div[2]/div/div[2]/div/div[2]/button/div")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
