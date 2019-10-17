//import java.util.*;

public class Check_Palindrome extends Account {
    public void Check_Palindrome(String Password){
        // this will be the Password string backwards
        String password2 = "";

        // measures the length of the password string
        int len = Password.length();

        // this will see if the password string equals password2
        for(int i = len - 1; i >= 0; i--)
        {
            password2 = password2 + Password.charAt(i);
        }
        if(Password.equalsIgnoreCase(password2)){
            System.out.println("Your password is a palindrome. Consider changing it.");
        }
        else{
            System.out.println("Your password is not a palindrome.");
        }
   }
}
