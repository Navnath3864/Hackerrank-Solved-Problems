import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char ch;
        String nstr="";
        /* Enter your code here. Print output to STDOUT. */
        for (int i=0; i<A.length(); i++)
        {
            ch= A.charAt(i); //extracts each character
            nstr=ch+nstr; //adds each character in front of the existing string
        }

        if(A.equals(nstr)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }    
    }
}



