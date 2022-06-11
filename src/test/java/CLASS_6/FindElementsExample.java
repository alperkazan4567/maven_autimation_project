package CLASS_6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsExample {
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

        //navigate to bing home
        driver.navigate().to("https://bing.com");
        Thread.sleep(3000);

        //click on image using class property with index of 1
        //to ignore white space in the property value we can use contains command in xpath
        driver.findElements(By.xpath("//li[contains(@class,'scope')]")).get(0).click();



    }//end of main

}//end of class
