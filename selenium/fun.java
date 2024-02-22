import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class fun {
    public static void main(String[] args) {
        FirefoxOptions firefoxOptions=new FirefoxOptions();
        firefoxOptions.setHeadless(true);
        WebDriver driver=new FirefoxDriver(firefoxOptions);
        WebDriverManager.firefoxdriver().setup();
        driver.get("https://www.google.com");
        //driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("cheese");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        String fun=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
        //System.out.println(fun);
        //driver.findElement(By.xpath("//*[@id=\"rso\"]/div[7]/div/div/div[1]/div/div/span/a/h3")).click();
        String[] words = fun.split("\\s+");
        //if (words.length >= 2) {
            String secondWord = words[1];
            System.out.println(secondWord);
        //} else {
            //System.out.println("There is no second word in the string.");
        //}
        String filename=System.currentTimeMillis()+"Test";
        File screenshot=((RemoteWebDriver)driver).getScreenshotAs(OutputType.FILE);
        File outputFile=new File("LoggerScreenshots/"+filename+".png");
        System.out.println(outputFile.getAbsolutePath());
        try {
            FileUtils.copyFile(screenshot, outputFile);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
