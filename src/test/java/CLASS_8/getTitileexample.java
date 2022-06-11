package CLASS_8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getTitileexample {
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

        //navigate to martgagecalculator site
        driver.navigate().to("http;//www.google.com");
        //capture the title of the page and compare it with your expected title 'GOOGLE'
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("GOOGLE")){
            System.out.println("My title matches");
        } else {
            System.out.println("Title doesnt match. Actual Title is " + actualTitle);
        }

        //by.xpath("//*[aria-label='"+startDate.get(i)+"')]")

    }//end of main


}//end of class
