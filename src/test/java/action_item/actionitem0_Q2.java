package action_item;

public class actionitem0_Q2 {
    public static void main(String[] args) {

        String[] cities = new String[] {"brooklyn","queen","manhattan","staten"};
    for(int i = 0; i < cities.length; i++) {
        String currentCity = cities[i];
        if (currentCity == "brooklyn" || currentCity == "manhattan") {
            System.out.println(currentCity);
        }
    }



    }//end of for loop


}
