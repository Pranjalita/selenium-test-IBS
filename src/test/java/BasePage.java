import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void launchApp() {
        driver.get("http://localhost:3000");
    }
}