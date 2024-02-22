import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Activity21 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/tab-opener");
        System.out.println("Home page title: " + driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"launcher\"]")).click();
        //wait.until(ExpectedConditions.numberOfWindowsToBe(1));
        Set<String> handles=driver.getWindowHandles();
        System.out.println(handles);
        Iterator<String> iterator=handles.iterator();
        String parentWindow=iterator.next();
        System.out.println(parentWindow);
        String childWindow1=iterator.next();
        System.out.println(childWindow1);
        String childWindow2=iterator.next();
        System.out.println(childWindow2);
        driver.switchTo().window(childWindow1);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("Title "+driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"actionButton\"]")).click();
        driver.switchTo().window(childWindow2);
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        System.out.println("Title "+driver.getTitle());
        //driver.switchTo().window(parentWindow);
        //String abc=driver.findElement(By.className("content")).getText();
        //System.out.println("Heading "+abc);




    }
}
