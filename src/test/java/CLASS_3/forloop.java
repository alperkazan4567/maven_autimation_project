package CLASS_3;

import java.util.ArrayList;

public class forloop {
    public static void main(String[] args) {
        //create a array list for cities and loop through all the values using for loop
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("Long Island");
        cities.add("staten island");

        for (int i = 0; i < cities.size(); i++){
            System.out.println("i is now " + i);
            System.out.println("my city is " + cities.get(i));
        }//end of for loop

    }//end of main
}//end of java class
