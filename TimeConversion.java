import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s){
    // Write your code here
      //get the string into an array using : as a separator
        String[] time_array = s.split(":");

        //military_time variable to be returned
        String military_time = new String();

        //final HH part
        String hh_final = new String();
        //Rest after HH to be concatenated to get military_time
        String rest = new String();


        StringBuilder REST_mil_builder = new StringBuilder();
        for (int i = 2; i < 8; i++) {
            REST_mil_builder.append(s.charAt(i));
        }
        //"rest" basically gets everything after HH excluding AM/PM, so 01:03:40PM would have a "rest" value of ":03:40"
        rest = REST_mil_builder.toString();

        int hh = Integer.parseInt(time_array[0]);
        String AMPM_contains = time_array[2];

        //converting if the last piece after the split contains "PM"
        if (AMPM_contains.contains("PM")) {
            int newhh=hh;
            hh = hh + 12;
            hh = hh == 24 ? newhh : hh;
        }
        else if (AMPM_contains.contains("AM") && hh==12) {
            hh=00;
        }

        //converting hh to have a 0 before it because when it is an integer 01 will be just 1 which we don't want
        StringBuilder hh_build = new StringBuilder();
        if (hh >= 0 && hh <= 9) {
            hh_build.append("0");
            hh_build.append(hh);
            hh_final = hh_build.toString();
        } else {
            hh_build.append(hh);
            hh_final = hh_build.toString();
        }

        //military time concatenation
        military_time = hh_final + rest;
        //Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock
        military_time = s == "12:00:00AM" ? "00:00:00" : military_time;
        //Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
        military_time = s == "12:00:00PM" ? "12:00:00" : military_time;
      //  System.out.println(military_time);
        return military_time;

    }
}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
      //  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      //  String s = bufferedReader.readLine();
//Hard conding
	String s="12:54:45AM";
	System.out.println("Input time = "+s);
        String result = Result.timeConversion(s);
	System.out.println("Output Time = "+result);

     //   bufferedWriter.write(result);
      //  bufferedWriter.newLine();

      //  bufferedReader.close();
      //  bufferedWriter.close();
    }
}
