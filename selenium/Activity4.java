import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4
{
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());
        WebElement message=driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
        System.out.println(message.getText());
        WebElement message1=driver.findElement(By.xpath("//h5[@class='ui green header']"));
        System.out.println(message1.getCssValue("color"));
        WebElement message2=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]"));
        System.out.println(message2.getAttribute("class"));
        WebElement message3=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
        System.out.println(message3.getText());
        //driver.close();
    }
}