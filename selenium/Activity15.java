import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[1]/input")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[2]/input")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/button")).click();
        //
        // wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"action-confirmation\"]"), "Welcome Back, admin"));
        String lateText = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]")).getText();
        System.out.println(lateText);
        //String message = driver.findElement(By.id("action-confirmation")).getText();
        //System.out.println("Login message: " + message);
    }
}
