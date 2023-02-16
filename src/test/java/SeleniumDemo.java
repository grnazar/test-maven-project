import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));

        String expectedTitle = "chatGPT";
        searchBox.sendKeys(expectedTitle, Keys.ENTER);

        String actualTitle = driver.getTitle();

//        if (actualTitle.contains(expectedTitle)) {
//            System.out.println("TEST PASSED!");
//        } else
//            System.out.println("TEST FAILED! The current title is: " + actualTitle + " The expected title was: " + expectedTitle);

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}

