package pro.camp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleTest {

    WebDriver driver;

    @Before
    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        //opt.setHeadless(true);
        opt.addArguments("start-fullscreen");
        driver = new ChromeDriver(opt);
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
