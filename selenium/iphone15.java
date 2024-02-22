import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class iphone15 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.flipkart.com/");

        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
        searchBox.sendKeys("iphone 15");
        //Actions builder=new Actions(driver);
       // builder.keyDown(Keys.RETURN).sendKeys("enter").keyUp(Keys.RETURN).build().perform();

        driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

        List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
        WebElement thirdPrice = priceList.get(2);
        System.out.println("Third Price: " + thirdPrice.getText());
        List<WebElement> taglist=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        WebElement tagnamee=taglist.get(2);
        System.out.println(tagnamee.getText());

        //driver.quit();
    }
}
