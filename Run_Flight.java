import java.util.Scanner;

public class Run_Flight {
    static Flight_List list = new Flight_List();
    static Account account = new Account();
    static Check_Palindrome palindrome = new Check_Palindrome();

    public static Scanner scan = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println("Welcome to Southwest Airlines's Portal");
        System.out.println("Please create an account to access our flight information.");

        System.out.println("Name? (Ex: John Doe)");
        String name = scan.nextLine();
        account.SetName(name);

        System.out.println("Enter your desired password.");
        String password = scan.nextLine();
        account.SetPassword(password);
        //goes to the Check_Palindrome class to check if the password is a palindrome.
        palindrome.Check_Palindrome(password);

        System.out.println("Enter enter your desired pin. (Ex: 1234)");
        String pin = scan.nextLine();
        account.SetPin(pin);

        System.out.println("Enter your birthday. (Ex: 01/01/2019)");
        String birthday = scan.nextLine();
        account.SetBirthday(birthday);

        System.out.print("Name: " + account.GetName() + "\nPassword: " + account.GetPassword() + "\nPin: " + account.GetPin() + "\nBirthday: " + account.GetBirthday());
        list.setFlights();
    }
}
