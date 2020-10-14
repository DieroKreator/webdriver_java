package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

//    public KeyPressesPage clickKeyPresses(){
//        clickLink("Key Presses");
//        return new KeyPressesPage(driver);
//    }
    
    public AlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }
    
    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText));
    }

    public ContextMenuPage clickContextMenu() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public FramesPage clickFramesPage(){
        clickLink("Frames");
        return new FramesPage(driver);
    }
}
