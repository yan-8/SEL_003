import org.openqa.selenium.*;

public class ResultAllPage {
    private WebDriver driver;

    public ResultAllPage() {
    }

    public ResultAllPage(WebDriver driver) {
        this.driver = driver;
    }

    public ResultAllPage navigationBlock() {
        return this;
    }

    public VideosPage clickOnVideos() {
        driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[3]/a")).click();
        return new VideosPage(driver);
    }

    public String getTitleFromFirstLink() {
        return driver.findElement(By.xpath(".//div[@class = 'g'][1]//span[@class = 'st']/em")).getText();
    }
}