package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactorySingleton {
    private static WebDriver INSTANCE;


    public static WebDriver getDriverInstance() {
        if (INSTANCE == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            INSTANCE = new ChromeDriver();
        }
        return INSTANCE;
    }

    public static void cleanup() {
        System.out.println("quitting browser");
        INSTANCE.quit();
    }
}