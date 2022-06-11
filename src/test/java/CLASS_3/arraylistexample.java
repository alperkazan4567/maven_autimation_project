package CLASS_3;


import java.util.ArrayList;

public class arraylistexample {
    public static void main(String[] args) {
        //create arraylist for countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA"); //this is index 0
        countries.add("Bangladesh");
        countries.add("India");
        countries.add("Canada");
        countries.add("Pakistan");

        //i want to print 4th value from the list
        System.out.println("My last country is " + countries.get(4) + "and my third country is " + countries.get(2));


    }//end of main method
}//end of java class
