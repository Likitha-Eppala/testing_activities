import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("http://v1.training-support.net/selenium/dynamic-controls");
        WebElement abc=driver.findElement(By.name("toggled"));
        System.out.println(abc.isSelected());
        abc.click();
        System.out.println(abc.isSelected());

    }
}
