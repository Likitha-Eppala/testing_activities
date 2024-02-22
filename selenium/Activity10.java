import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity10 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("http://v1.training-support.net/selenium");
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[7]/a/div/div[1]")).click();
        WebElement abc=driver.findElement(By.name("toggled"));
        System.out.println(abc.isDisplayed());
        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println(abc.isDisplayed());
        //driver.close();
    }
}
