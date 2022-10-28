import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PresenceOfLogo {
    @Test
    public void CheckPresenceOfLogo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bookdepository.com/");

        WebElement logo = driver.findElement(By.xpath("//div[@class='user-nav']/descendant::*[@class='icon-em']"));

        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed");
    }
}
