package ReusableLibrary;

public class ReusableMethod {

    //create a void method to add two numbers

    public static void addTwoNumbers(int num1, int num2){
        int result = num1+num2;
        System.out.println("The result of two number is " + result);
    }//end of add two method

    //create a return

    public static int subtractTwoNumbers(int a, int b){
        int result = a-b;
        System.out.println("The result of two numbers for subtraction is " + result);

        return result;

    }



}//end of java class
