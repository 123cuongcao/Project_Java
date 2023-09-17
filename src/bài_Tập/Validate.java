package bài_Tập;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean validateUsername(String username) {
        String usernameRegex = "^[a-z0-9_]{6,}$";
        Pattern pattern = Pattern.compile(usernameRegex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] usernames = {
                "valid_username",
                "invalid!username",
                "short",
                "username123",
                "User_Name"
        };
        for (String username : usernames) {
            boolean isValid = validateUsername(username);
            System.out.println(username + " is valid: " + isValid);
        }
    }
}
