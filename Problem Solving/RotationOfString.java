/*
Rotation of string is present or not
 ex1: 
	String s1= "ABCD";
	String s2= "CDAB";

	s1 & s1 have rotation like ABCD - CDAB --> rotation is present.
	
ex2: 
	String s1= "ABCD";
	String s2= "CDEF";

	s1 & s1 have rotation like ABCD - CDAB --> rotation is NOT present.

*/

public class MyClass {
    public static void main(String args[]) {
     String str1="ABCD";
     String str2 ="ABCD";
     
     if(isRotational(str1,str2)){
         System.out.println("Rotation of string is present");
     }else{
        System.out.println("the given string are NOT rotational");    
     }
}
    
    public static boolean isRotational(String str1, String str2){
         return (str1.length()==str2.length()) && ((str1+str1).indexOf(str2) != -1);
    }
     
}