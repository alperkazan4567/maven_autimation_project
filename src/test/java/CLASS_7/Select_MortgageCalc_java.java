package CLASS_7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Select_MortgageCalc_java {
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
        Thread.sleep(2000);
        //select start month frpm the dropdown
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
        //define select command
        //Select dropDown = new Select(startMonth);
        //select select command
        //dropDown.selectByVisibleText("jun");

        //clicking on dropdown and its value if the dropdown tag is not under select tag
        startMonth.click();
        //click on the value of the start month
        driver.findElement(By.xpath("//*[text()='jun']")).click();


        //select loan type from dropdown
        WebElement loanType = driver.findElement(By.xpath("//*[@name='param[milserve]']"));
        //define select command
        Select loanTypeDropdown = new Select(loanType);
        //select by visable text
        loanTypeDropdown.selectByVisibleText("FHA");


    }//end of main

}//end of class
