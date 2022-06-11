package CLASS_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_search_test {

    public static void main(String[] args) {

        //setup your chromedriver with WebDriverManager
        WebDriverManager.chromedriver().setup();
        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver();

        //go to google home page
        driver.navigate().to("https://www.google.com/");
        //Thread.sleep(3000);
        //maximize the driver
        //driver.manage().window().maximize(); //for mac use window().fullscreen();
        //locate element for search field and type keyword 'cars'
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        //submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        //capture the google search and print it
       String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //System.out.println("result is " + searchResult);
        //extract out the number and print number only
        String[] arrayResult = searchResult.split("");
        //to replace ( and ) from the seconds that's coming from arrayList[3] use .replace command to replace it with ""
        //String replaceParanth = arrayResult[3].replace("(","").replace(")","");
        System.out.println("My search number is " + arrayResult[0]);

        //quit the driver
        //driver.quit();

    }//end of main

}//end of java class
