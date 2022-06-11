package CLASS_6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_MartgageCalc {
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

        //declare javascriptExecutor variable
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll to pixel 400 on morgage calc website
        jse.executeScript("scroll(0,800)");
        //wait a bit for browser to preform scrolling
        Thread.sleep(3000);

        //declare a webelement variable that we want to scroll into
        WebElement shareButton = driver.findElement(By.xpath("//*[@id= 'share_button']"));
        //scroll into share this calculation button
        jse.executeScript("arguments[0].scrollIntoView(true);", shareButton);
        Thread.sleep(3000);
        //click on the share this calculation button
        shareButton.click();
        Thread.sleep(3000);
        //scroll back up
        jse.executeScript("scroll(0,-400)");
        Thread.sleep(3000);
        //quit the chrome driver
        driver.quit();


    }//end of main

}//end of class
