package base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
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
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
