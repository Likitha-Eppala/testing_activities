import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity17 {
    public static void main(String[] args) {
            WebDriverManager.firefoxdriver().setup();
            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();
            driver.get("https://v1.training-support.net/selenium/selects");
            System.out.println("Home page title: " + driver.getTitle());
            // Create the Wait object
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement dropdown = driver.findElement(By.xpath("//select"));
            Select list=new Select(dropdown);
            //driver.findElement(By.xpath("//*[@id=\"single-select\"]")).click();
            List<WebElement> options=list.getOptions();
            for(WebElement cell:options) {
                    System.out.println(cell.getText());
            }
            list.selectByVisibleText("Option 2");
            list.selectByIndex(5);
            //list.selectByValue("4");
            List<WebElement> abc=list.getAllSelectedOptions();
            for(WebElement cell:abc) {
                    System.out.println(cell.getText());
            }


    }
}
