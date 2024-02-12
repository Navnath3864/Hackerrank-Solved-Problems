/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers,  and .

Constraints

 and  are non-negative integers and can have maximum  digits.

Output Format

Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.

Sample Input

1234
20
Sample Output

1254
24680
Explanation




*/

/*____________________________________________________________________________*/

import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class BigIntegerTest {

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
