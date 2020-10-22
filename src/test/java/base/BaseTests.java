package base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //be careful of doing this cause it is at project level
        goHome();

        homePage = new HomePage(driver);

        //Return only one web element
//        WebElement inputLink = driver.findElement(By.linkText("Inputs"));
//        inputLink.click();

        //Return list of elements
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());

        //Count how many links on page
//        driver.findElement(By.linkText("Shifting Content")).click();
//        driver.findElement(By.linkText("Example 1: Menu Element")).click();
//        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
//        System.out.println("Number of items: " + menuItems.size());

//        System.out.println(driver.getTitle());

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        //options.setHeadless(true);
        return options;
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }


}
