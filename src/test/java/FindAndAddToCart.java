import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindAndAddToCart {
    @Test
    public void findElementsAndAddToCart() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bookdepository.com/");

        WebElement searchInput = driver.findElement(By.xpath("//*[@id='book-search-form']//input[1]"));
        searchInput.sendKeys("Camilla");

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='header-search-btn']"));
        searchButton.click();

        WebElement clickOnProduct = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div[4]/div/div/div/div/div[4]/div[1]/a"));
        clickOnProduct.click();

        WebElement addToBasket = driver.findElement(By.xpath("//a[@class='btn btn-primary add-to-basket']"));
        addToBasket.click();

        WebElement basketBtn = driver.findElement(By.cssSelector(".secondary-header-wrap .basket-wrap a"));
        basketBtn.click();

        WebElement articleIsPresent = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div[2]/div[1]/div[2]/h2/a"));

        Assert.assertTrue(articleIsPresent.isDisplayed(), "Item is not added to the cart");

        Thread.sleep(5000);
        driver.quit();
    }
}
