import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PresenceOfNavigationMenu {
    @Test
    public void CheckPresenceOfNavigationMenu() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bookdepository.com/");

        WebElement navigationMenu = driver.findElement(By.xpath("(//a[@class='tbd-dropdown-toggle desktop-only'])[1]"));

        Assert.assertTrue(navigationMenu.isDisplayed(), "Navigation menu not displayed");

    }
}
