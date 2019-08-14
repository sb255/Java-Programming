import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Validating an email address of domain: samarthbais using regular expression in Java

/*
 *     ^   - starting of the matching regex
 *     $   - ending of the matching regex
 *     \\w - Any alphanumeric character
 *     \\. - Dot character
 *     +   - More than one character
 */

public class JavaRegex {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        String email = sc.next();
        
        Pattern p = Pattern.compile("^\\w+@samarthbais\\.com$"); 

        Matcher matcher = p.matcher(email);
    
        if(matcher.find()){
            System.out.println("The Person has a valid samarthbais account!");
        }
        
        else
            System.out.println("This is not a valid samarthbais account!");

    }

}
