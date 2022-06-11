package CLASS_6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElement_mortgage {
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

        //navigate to martgagecalculator site
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);
        //click, clear and enter new value on home value field
        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval ']"));
        homeValue.click();
        homeValue.clear();
        //thread.sleep(1500);
        homeValue.sendKeys("450000");

        //click on % radio button
        driver.findElement(By.xpath("//*[@value='percent']")).click();

        //click, clear and enter new data payment feild
        WebElement downPayment = driver.findElement(By.xpath("//*[@id='downpayment']"));
        downPayment.click();
        downPayment.clear();
        downPayment.sendKeys("5");

    }//end of main
}//end of class
