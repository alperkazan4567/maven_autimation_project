package CLASS_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class USPS_Implicit_Explicit {

    public static void main(String[] args) throws InterruptedException {

        //setup your chromedriver with WebDriverManager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //SET THE CONDITION TO INCOGNITO mode
        options.addArguments("incognito");
        //set the condition to maximum/fullscreen your driver
        options.addArguments("start-maximized");
        //setting your driver as headless(running in backround)
        //options.addArguments("headless");
        //for mac use fullscreen
        //options.addArguments("start fullscreen")
        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);

        //set your global implicit wait
        //driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        //navigate to
        driver.navigate().to("https://www.usps.com");

        //call mouse actions
        Actions actions = new Actions(driver);

        //declare and define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 8);

        //hover to quick tool
        WebElement quickTools = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Quick Tools']")));
        actions.moveToElement(quickTools).perform();

        //click on track a package
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();

        //click and then type
        WebElement packageFeild = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id'tracking-input']")));
        packageFeild.click();
        packageFeild.sendKeys("122223232232");


    }//end of main
}//end of class
