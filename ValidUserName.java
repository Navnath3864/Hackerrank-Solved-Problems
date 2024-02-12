import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ValidUserName {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String username = in.nextLine();
         String pattern = "^[a-zA-Z]{1,1}[a-zA-Z0-9_]{7,29}$";
           Pattern r = Pattern.compile(pattern);
           Matcher m = r.matcher(username);
         if (m.find( )) {
            System.out.println("Valid");
         } else {
            System.out.println("Invalid");
         }
         testCases--;
      }
    }
}
