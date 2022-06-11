package CLASS_4;

public class SPLIT_MESSAGE {
    public static void main(String[] args) {
        //declare string variable
        String splitMessage = "my name is john";
        //declare an array of string to store the string split
        String[] splitMessageArray = splitMessage.split(" ");

        //print out john to the console
        System.out.println("my first name is " + splitMessageArray[1]);

    }
}
