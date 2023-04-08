import constants.WebDriverConstants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NotinoValidateLoginFormTestCase {
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
    public void testUntitledTestCaseValidareLogin() throws Exception {
        driver.get("https://www.notino.ro/");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Livrare'])[1]/following::*[name()='svg'][3]")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).sendKeys("dggghtrh");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Password")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Password")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Password")).sendKeys("wergtg");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.name("button")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("col-content")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("col-content")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).sendKeys("ioana@gmail.com");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("col-content")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("col-content")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Password")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Password")).sendKeys("AnimalDragut!3");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.name("button")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("col-content")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).sendKeys("ioanakolceag1101@gmail.com");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Password")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Password")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Password")).sendKeys("animaldraut");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.name("button")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("col-content")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).sendKeys("");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Password")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Password")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Password")).sendKeys("animaldragut");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.name("button")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).clear();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Email")).sendKeys("ioanakolceag1101@gmail.com");
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.id("Password")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
        driver.findElement(By.name("button")).click();
        Thread.sleep(WebDriverConstants.MILLIS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
