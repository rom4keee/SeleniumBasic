import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PresenceOfBanner {
    @Test
    public void CheckPresenceOfBanner() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bookdepository.com/");

        WebElement banner = driver.findElement(By.xpath("//img[@alt='Bookdepository.com']"));

        Assert.assertTrue(banner.isDisplayed(), "Banner not displayed");
    }
}

