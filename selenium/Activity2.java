import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity2
{
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new EdgeDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println(driver.getTitle());

        driver.findElement(By.id("username")).sendKeys("admin");

        driver.findElement(By.id("password")).sendKeys("password");

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button")).click();

    }
}