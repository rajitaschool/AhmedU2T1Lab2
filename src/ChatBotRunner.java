import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ChatBot chatbot1 = new ChatBot("Saul Goodman", 5, "cats");
        chatbot1.greeting("Rajit"); //Calls Method 1
        chatbot1.weather(); //Calls method 2

        System.out.println("Give me a random height to the nearest foot, I'll convert it to meters!");
        int feetInput = scan.nextInt();
        scan.nextLine();
        System.out.println(feetInput + " feet to meters is: " + chatbot1.convertFeetToMeters(feetInput)); //Calls Method 3
        System.out.println("Hey what's your favorite whole number?");
        int userFavoriteNumber = scan.nextInt();
        chatbot1.favoriteNumber(userFavoriteNumber); //Calls method 4
        System.out.println("Hey! Give me 3 random whole numbers, will ya?");
        int num1Input = scan.nextInt();
        scan.nextLine();
        System.out.println("Alright 2 more! Let's see what you got.");
        int num2Input = scan.nextInt();
        scan.nextLine();
        System.out.println("Its the final number! Let's see what you have in store for me.");
        int num3Input = scan.nextInt();
        scan.nextLine();
        System.out.println("Would you believe me if I told you I can do something crazy?"); //Calls Method 5
        System.out.println("The sum of those 3 numbers is.. " + chatbot1.addNumbers(num1Input, num2Input, num3Input) + "!! Crazy isn't it?");
        System.out.println(chatbot1.goodbye()); //Calls Method 6
        chatbot1.yourLocation(); //Calls Method 7
        System.out.println("Hey, whats your favorite animal by the way? (Lower case and plural please!)");
        String userFavoriteAnimal = scan.nextLine();
        System.out.println(chatbot1.sameFavoriteAnimal(userFavoriteAnimal));







    }
}
