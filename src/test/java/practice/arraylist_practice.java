package practice;

import java.util.ArrayList;

public class arraylist_practice {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Bangladash");
        countries.add("India");
        countries.add("Canada");
        countries.add("Pakistan");

        System.out.println("My last country is " + countries.get(0) + "and my third country is " + countries.get(2));

    }
}
