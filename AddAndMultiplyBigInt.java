import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class AddAndMultiplyBigInt {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        BigInteger num1= new BigInteger(str1);
        BigInteger num2= new BigInteger(str2);
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
        
    }
}
