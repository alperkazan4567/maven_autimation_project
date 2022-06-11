package action_item;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem5 {
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
        driver.navigate().to("https://www.uhc.com/");
        Thread.sleep(3000);

        String my_title=driver.getTitle();
        System.out.println("Title is" + my_title);


        try {
            driver.findElement(By.xpath("//*[@class='find-doctor position-relative  cta button-style__outline-blue cta--remove-icon mr-2 lg-items-center lg-flex']")).click();
            Thread.sleep(2500);
        } catch (Exception e) {
            System.out.println("unable to locate find doctor element ");
        }

        try {
            driver.findElement(By.xpath("//*[@class='signin signin-menu__content-wrapper position-relative lg-items-center lg-flex']")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("unable to locate sign in element ");
        }

        try {
            driver.findElement(By.xpath("//*[@class='signin__link weight-bold display-block px-5 py-2']")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("unable to locate medicare plan ");
        }

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        try {
            driver.findElement(By.xpath("//*[@class='link-text']")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("unable to locate register ");
        }

        try {
            driver.findElement(By.xpath("//*[@class='Tier1Component_inputDefault__1Av0M']")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("unable to locate register ");
        }

        try {
            driver.findElement(By.xpath("//*[@class='rds-secondary-button']")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("unable to locate register now ");
        }


        WebElement FirstName = driver.findElement(By.xpath("//*[@class='Tier1Component_inputDefault__1Av0M']"));
            FirstName.click();
            FirstName.clear();
            FirstName.sendKeys("Alper");

        WebElement LastName = driver.findElement(By.xpath("//*[@id='lastName']"));
        LastName.click();
        LastName.clear();
        LastName.sendKeys("Kazan");










    }
}
