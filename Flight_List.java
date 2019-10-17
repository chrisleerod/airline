import java.util.Random;

public class Flight_List {
    public String Nashville;
    public String Atlanta;
    public String Memphis;
    public String Houston;
    public String Knoxville;

    public void setFlights(){
        /* Utilizes the same random number to align the prices, departure time, and return date the same every time while giving
        different results each time by utilizing the random number generator.
        */
        String origin = "Nashville";
        String[] destination = {"Atlanta", "Memphis", "Houston", "New York"};
        String[] price = {"$440", "$210", "$525", "$630"};
        String departure = "on October 21st at 3:00 PM";
        String[] returnDate = {"October 26th at 10:00 AM", "October 26th at 2:00 PM", "October 26th at 10:00 PM", "October 27th at 3:00 AM"};
        Random r = new Random();
        int randomNumber = r.nextInt(destination.length);
        System.out.println("\nYour origin is " + origin + " and your destination is " + destination[randomNumber] + ". The cost of the ticket is " + price[randomNumber] + "." +
                "\nYour departure is " + departure + " and your return date is on " + returnDate[randomNumber]);
    }
}
