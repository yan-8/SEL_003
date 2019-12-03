import org.openqa.selenium.*;
import org.junit.*;
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    protected WebDriver driver;
    protected SearchPage homePage;
    protected ResultAllPage resultAllPage;
    protected VideosPage videosPage;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }

    @After
    public void finish() {
        driver.quit();
    }
}