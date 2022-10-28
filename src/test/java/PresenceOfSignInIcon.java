import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PresenceOfSignInIcon {
    @Test
    public void CheckPresenceOfSignInIcon() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bookdepository.com/");

        WebElement signIn = driver.findElement(By.xpath("//div[@class='user-nav']/descendant::*[@href='/account/login/to/account']"));

        Assert.assertTrue(signIn.isDisplayed(), "SignIn icon not displayed");
    }
}
