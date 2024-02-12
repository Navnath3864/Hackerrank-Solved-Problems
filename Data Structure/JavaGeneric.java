/*
Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.

Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

You are given code in the editor. Complete the code so that it prints the following lines:

1
2
3
Hello
World
Do not use method overloading because your answer will not be accepted.
*/
/*___________________________________________________________________________*/

import java.io.*;
import java.util.*;

public class JavaGeneric {
    static <T> void printArray(T  t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution obj=new Solution();
        obj.printArray(1);
        obj.printArray(2);
        obj.printArray(3);
        obj.printArray("Hello");
        obj.printArray("World");
        
    }
}