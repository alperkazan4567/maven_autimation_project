package action_item;

import java.util.ArrayList;

public class actionitem1_Q1 {

    public static void main(String[] args) {
        // this is linear array because its all in one line of code
        int[] countrycode = new int[] {1, 123, 222, 333};

        //create arraylist for countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA"); //this is index 0
        countries.add("Bangladesh");
        countries.add("India");
        countries.add("Canada");

        for (int i = 0; i < (4); i++){

            System.out.println("My first country is " + countries.get(i) + " and countrycode is " + countrycode[i]);

        }//end of for loop
    }//end of main
}//end of java class
