import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
       
        if(a.length()!=b.length()){
            return false;
        }
       String a11= a.toLowerCase();
        String b11=b.toLowerCase();
        //System.out.println(a11+" "+b11);
        // Complete the function
        char[] a1 = a11.toCharArray();
        char[] b1 = b11.toCharArray();
        
        // sort char array a1
        char temp;
        int i=0;
        while(i<a1.length){
            int j=i+1;
            while(j<a1.length){
                if(a1[j]<a1[i]){
                    temp=a1[i];
                    a1[i]=a1[j];
                    a1[j]=temp;
                }
                j=j+1;
            }
            i=i+1;
        }
        
        
        //System.out.println(a1);
        
        // sort char array b1
        char temp1;
        int x=0;
        while(x<b1.length){
            int y=x+1;
            while(y<b1.length){
                if(b1[y]<b1[x]){
                    temp1=b1[x];
                    b1[x]=b1[y];
                    b1[y]=temp1;
                }
                y=y+1;
            }
            x=x+1;
        }
        String str1=new String(a1);
        String str2 = new String(b1);
      //  System.out.println(str1+" "+str2);
       // System.out.println(b1);
       // compare two string array
       if(str1.equals(str2)){
           return true;
       }
       else{
           return false;
       }
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
