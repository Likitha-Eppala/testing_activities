import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
public class icicibank {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.icicibank.com");
        driver.findElement(By.xpath("//*[@id=\"new-header-v2\"]/div[1]/div[3]/div[1]/div/nav/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"new-header-v2\"]/div[1]/div[3]/div[1]/div/nav/ul/li[4]/div/div[1]/ul/li[4]/a")).click();
        List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='content-wrapper']"));
        int xpathCount = priceList.size();
        System.out.println("Total xpath: " + xpathCount);
        driver.close();
    }
}

