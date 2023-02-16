import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WarmUp {

    @Test
    public void warmUP()throws InterruptedException{
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        Thread.sleep(30000);
        driver.findElement(By.name("username")).sendKeys("minnie.mouse");
        driver.findElement(By.name("password")).sendKeys("minnie", Keys.ENTER);
        Thread.sleep(10000);

        String errorMessage = driver.findElement(By.id("slfErrorAlert")).getText();
        Assert.assertEquals(errorMessage, "Sorry, your password was incorrect. Please double-check your password.");

        driver.quit();
    }
}