package CLASS_7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Handiling_tabs_Fidelis_Care {
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
        driver.navigate().to("https://www.fideliscare.org/");
        Thread.sleep(2000);

        //click on shop for a plan
        driver.findElements(By.xpath("//*[text() = 'Shop For a Plan']")).get(0).click();
        //wait a bit for page to load
        Thread.sleep(1000);

        driver.findElements(By.xpath("//*[text() = 'Medicaid Managed Care']")).get(0).click();
        //wait a bit for page to load
        Thread.sleep(1000);

        //click on medicade managed care
        driver.findElement(By.xpath("//*[@href='/findadoctor']")).click();
        //wait a bit for new tab
        Thread.sleep(1000);

        //store new tab in an array list, we use getWindowHandles method to get list of tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to new tab, it should be at index 1
        driver.switchTo().window(tabs.get(1));
        //click on new search button
        driver.findElement(By.xpath("//*[@class = 'fal fa-search-plus']")).click();
        //wait a bit for a click
        Thread.sleep(1000);
        //close new tab
        //driver.close();
        //switch back to the default tab
        driver.switchTo().window(tabs.get(0));
        //then click on providers card
        driver.findElement(By.xpath("//*[class = 'fal fa-stethoscope fa-fw']")).click();
        //wait until provider card is clicked ON
        Thread.sleep(2000);


    }//end of main
}//end of class
