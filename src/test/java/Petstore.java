import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Petstore {
    WebDriver driver = null; // so it will be nulled and ready to use
    @BeforeClass
    void setup(){
        WebDriverManager.chromedriver().setup();
    }
    @Test
    void registration(){
        driver = Helper.setupDriver();
        driver.get(Helper.PETSOTREURL);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Helper.ENTERTHESTORE))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Helper.SIGNIN))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Helper.REGISTERNOW))).click();

        Registrationform form = new Registrationform(driver);
        form.registration(Helper.account1);
    }

}
