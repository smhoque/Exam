package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by riponctg on 1/5/2017.
 */
public class CommonApi {
    public WebDriver driver = null;

   // @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\riponctg\\IdeaProjects\\eCommerce\\Generic\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.close();
    }

}
