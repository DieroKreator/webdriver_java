package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class BaseTests {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //Return only one web element
//        WebElement inputLink = driver.findElement(By.linkText("Inputs"));
//        inputLink.click();

        //Return list of elements
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());

        //Count how many links on page
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("Number of items: " + menuItems.size());

//        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
