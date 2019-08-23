package pro.camp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class SimpleTest {

    WebDriver driver;

    @Before
    public void startBrowser() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    @After
    public void stopBrowser() {
        driver.quit();
    }

    @Test
    public void test() {
        System.out.println(((HasCapabilities) driver).getCapabilities());
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

    }
}
