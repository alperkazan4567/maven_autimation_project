package CLASS_12;

import Reusable_Class.Reusable_Actions_Loggers;
import Reusable_Class.Reusable_Annotations_Class;
import org.testng.annotations.Test;

public class Google_Search_With_Reusable_Annotations extends Reusable_Annotations_Class {


    //test case 1: navigate to google and enter a keyword on search field
    @Test(priority = 1)
    public void SearchForKeyword(){

        driver.navigate().to("https://www.google.com");
        //enter a keyword on search field
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@name='q']","BMW",logger,"Search Field");
        //submit the go button
        Reusable_Actions_Loggers.submitAction(driver,"//*[@name='btnK']",logger,"Google Search Button");

        //end the logger per test
        reports.endTest(logger);
    }//end of test 1

    /*
    dependsOnMethods is used when  following @Test is dependent on previous @Test method. If the first test fails,
    the dependent test will get skipped
     */
    @Test(dependsOnMethods = "SearchForKeyword")
    public void CaptureSearchNumber(){

        //capture search result
        String result = Reusable_Actions_Loggers.getTextAction(driver,"//*[@id='result-stats']",logger,"Search Result Text");
        //split the result by single space and print out the search number
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);


    }//end of test 2

}
