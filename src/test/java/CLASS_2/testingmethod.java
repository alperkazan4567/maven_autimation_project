package CLASS_2;

import ReusableLibrary.ReusableMethod;

public class testingmethod {

    public static void main(String[] args) {

        //call the add two number method and excute it
        //ReusableMethod.addTwoNumbers(20,30);

        //cal the return method and store it in a variable to preform something else
        int finalResult = ReusableMethod.subtractTwoNumbers(50, 10);
        int newResult = finalResult + 10;
        System.out.println("new result is " + newResult);



    }//end of main method

}//end of java class
