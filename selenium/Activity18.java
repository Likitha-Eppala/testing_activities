import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
public class Activity18{
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println("Home page title: " + driver.getTitle());
        WebElement dropdown = driver.findElement(By.id("multi-select"));
        Select list=new Select(dropdown);
        //driver.findElement(By.xpath("//*[@id=\"single-select\"]")).click();
        List<WebElement> options=list.getOptions();
        for(WebElement cell:options){
            System.out.println(cell.getText());
        }
        list.selectByVisibleText("Javascript");
        list.selectByIndex(3);
        list.selectByIndex(4);
        list.selectByIndex(5);
        list.selectByValue("node");
        list.deselectByIndex(5);
        List<WebElement> abc=list.getAllSelectedOptions();
        for(WebElement cell:abc)
        {
            System.out.println("all selected options are"+cell.getText());
        }
    }
}

