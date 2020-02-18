import org.junit.Test;
import utilities.DriverFactorySingleton;

public class TestTerminalMap {

    private BasePage basePage = new BasePage(DriverFactorySingleton.getDriverInstance());

    @Test
    public void viewTerminal()  {
     basePage.launchApp();
    }
}
