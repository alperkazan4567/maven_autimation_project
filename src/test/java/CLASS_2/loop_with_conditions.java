package CLASS_2;

import java.util.ArrayList;

public class loop_with_conditions {
    public static void main(String[] args) {
       //create an array wirh fruits and print only when fruit is apple or orange
        ArrayList<String>fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("strawberry");

        for (int i = 0 ; i < fruits.size(); i++){
            //with if conditions
            /*
            if(fruits.get(i) == "apple"){
                System.out.println("my fruit is " + fruits.get(i));
            }else if(fruits.get(i) == "grape"){
                System.out.println("my fruit is " + fruits.get(i));
            }//end of if condition
            */

            //with or operator
            if(fruits.get(i).equalsIgnoreCase("apple") || fruits.get(i) == "grape"){
                System.out.println("my fruit is " + fruits.get(i));
            }

        }//end of loop

    }//end of main
}//end of java class






