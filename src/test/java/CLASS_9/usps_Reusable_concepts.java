package CLASS_9;

import ReusableLibrary.Reusable_Actions;
import org.openqa.selenium.WebDriver;

public class usps_Reusable_concepts {
    public static void main(String[] args) {

        //setting
        WebDriver driver = Reusable_Actions.setDriver();

        //Navigate to usps
        driver.navigate().to("https://www.usps.com");

        //hovering to the quick tools
        Reusable_Actions.mouseHover(driver,"//*[test()='Quick Tools']","Quick Tools");

        //hover to send tab
        Reusable_Actions.mouseHover(driver,"//*[@id='mail-ship-width']","Send Tab");

        //click on calculate a price
        Reusable_Actions.clickAction(driver,"//*[@class='tool-calc']","Calculate a Price");

        //print out header text info
        String result = Reusable_Actions.getTextAction(driver,"//*[@class='header-usps row']","Header Info");
        System.out.println("my header info is " + result);

        //enter the zip code
        Reusable_Actions.sendKeysAction(driver,"//*[@name='Destination']","11219","Zip Code");


    }
}
