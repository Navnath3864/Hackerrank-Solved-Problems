/*special character checking and removed from String and also count number of special character*/
public class MyClass {
    public static void main(String args[]) {
     String s= "!#$GeeeksforGeeks.kj";
     int count=0;
     String SpecialCharRemoved="";
       // System.out.println(s.length());
        for(int i=0;i<s.length();i++){
            // to check the given character is special character or Not using Character Class 
            //in character class we have isDigit,isLetter & isWhitespace method / function that is used for check special char 
            // the function exclude means we use !
            if(!Character.isDigit(s.charAt(i))
                && !Character.isLetter(s.charAt(i))
                && !Character.isWhitespace(s.charAt(i))){
                    // here count special character
                count++;
                // print spacial character
                System.out.print(s.charAt(i)+" ");
                
            }
            else{
                // we remove the special Character
                SpecialCharRemoved+=s.charAt(i);
            }
        }
        if(count==0){
            System.out.println("their is no special charactser is the given string");
        }
        else{
            System.out.println("\n"+count);
        }
        System.out.println(SpecialCharRemoved);
    }
}