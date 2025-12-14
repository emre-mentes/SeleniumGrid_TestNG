import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import static org.testng.Assert.assertTrue;

public class SeleniumGridEdge {
    WebDriver driver;

    @Test
    public void test03() throws MalformedURLException {

        driver =new RemoteWebDriver(new URL("http://192.168.2.103:4444"),new EdgeOptions());
        driver.manage().window().maximize();
        driver.get("https://techproeducation.com");
        String title = driver.getTitle();
        assertTrue(title.contains("TechPro Education"));
        driver.quit();
    }
}
