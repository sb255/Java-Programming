import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*  Problem statement:
 *  Validating a phone number BAA-AAA-AAAA using regular expression in Java..
 *  ..where A is a digit ranging 0-9 and B is also a digit ranging 1-9
 */

/*
 *     ^     - starting of the matching regex
 *     $     - ending of the matching regex
 *     \\w   - Any alphanumeric character
 *     \\.   - Dot character
 *     +     - More than one character
 *     [1-9] - Any digit between 1 to 9
 */

public class JavaRegex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String email = sc.next();

        Pattern p = Pattern.compile("^[1-9]\\d{2}-\\d{3}-\\d{4}$");

        Matcher matcher = p.matcher(email);

        if(matcher.find()){
            System.out.println("This is a valid phone number");
        }

        else
            System.out.println("This is not a valid phone number");

    }

}
