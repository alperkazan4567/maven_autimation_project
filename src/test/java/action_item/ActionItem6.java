package action_item;

import ReusableLibrary.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ActionItem6 {
    //declare the local driver outside so that it can be reusable with other annotation metho
    WebDriver driver;
    //before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();
    }//end of before suite annotation
    //declare the local driver outside so that it can be reusable with other annotation metho

    @Test()
    public void See_Credit_Score()throws InterruptedException {
        driver.navigate().to("https://www.experian.com/");
        //click on Sign in
        Reusable_Actions.clickAction(driver,"//*[text()='Sign in']","Sign In");
    }




}
