package action_item;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class actionitem3_Q1 {
    public static void main(String[] args) throws InterruptedException {

        //setup your chromedriver with WebDriverManager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //SET THE CONDITION TO INCOGNITO mode
        //options.addArguments("incognito");
        //set the condition to maximum/fullscreen your driver
        options.addArguments("start-maximized");
        //setting your driver as headless(running in backround)
        //options.addArguments("headless");
        //for mac use fullscreen
        //options.addArguments("start fullscreen")
        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);


        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("manhattan");
        cities.add("staten island");
        for (int i = 0; i < cities.size(); i++) {
            //go to google home page1
            driver.navigate().to("https://www.bing.com/");
            Thread.sleep(3000);
            driver.manage().window().maximize();
            //maximize the driver
            //driver.manage().window().maximize(); //for mac use window().fullscreen();
            //locate element for search field and type keyword 'cars'
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys("shoes");
            //submit on google search button
            driver.findElement(By.xpath("//*[@name='q']")).submit();
            Thread.sleep(2500);
            //capture the google search and print it
            String searchResult = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            //System.out.println("result is " + searchResult);
            //extract out the number and print number only
            String[] arrayResult = searchResult.split(" ");
            //to replace ( and ) from the seconds that's coming from arrayList[3] use .replace command to replace it with ""
            //String replaceParanth = arrayResult[3].replace("(","").replace(")","");
            System.out.println("My search number for city is " + cities.get(i) + " is " + arrayResult[0]);

        }//end of for loop

        //quit the driver
        driver.quit();


    }//end of driver
}






