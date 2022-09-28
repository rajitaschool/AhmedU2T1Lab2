public class ChatBot {

    // instance variables
    private String name;
    private int number;
    private String animalname;

    // constructor
    public ChatBot(String chatBotName, int faveNum, String favoriteAnimal) {
        name = chatBotName;
        number = faveNum;
        animalname = favoriteAnimal;
    }

    // method that prints a greeting
    public void greeting(String yourName) {
        System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
        System.out.println("I am a chat bot! How are you today?");
    }

    // method that prints the weather
    public void weather() {
        System.out.println("I actually don't know much about the weather! Ha ha!");
        System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
    }

    // method that converts feet to meters and returns the meters
    public double convertFeetToMeters(int numFeet) {
        final double METERS_PER_FOOT = 0.3048;
        return METERS_PER_FOOT * numFeet;
    }

    // method that prints information about favorite numbers
    public void favoriteNumber(int yourNumber) {
        int distance = yourNumber - number;  // number is an instance variable
        System.out.println("My favorite number is " + number);
        System.out.println("That is " + distance + " away from your number!");
    }

    // method that adds and returns the sum of three numbers
    public int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // method that RETURNS a goodbye message as a String -- note there is no printing here!
    public String goodbye() {
        return "It was nice talking with you! Have a great day! Sincerely, " + name;
    }


    // method that prints which state you are in. For this case it will always be New York for Time Sake
    public void yourLocation() {
        System.out.println("I can't really guess where you are right now but!");
        System.out.println("Because you created me, I know you live in New York!");
    }

    // method gets your favorite animal and returns if the chatbot also likes it
    public String sameFavoriteAnimal(String yourFavoriteAnimal) {
        if (yourFavoriteAnimal.equals(animalname)) {
            return "Hey, we both like " + animalname + "!";
        } else {
            return "Oh, you like " + yourFavoriteAnimal + ", I actually like " + animalname + "!";
        }
    }

}