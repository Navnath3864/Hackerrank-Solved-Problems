/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Result{
    public static long repeatedString(String s, long n) {
    // Write your code here
    long count =0;
    long newCount=0;
    long cnt=0;
    long substr=0;
    while(s.length()!=0){
        if(s.contains("a")){
            ++count;
        }
    }
    substr =n/s.length();
    if(n%s.length()==0){
         cnt=count*substr;
    }
    else{
        long reqChar=n%s.length();
        int num= (int)reqChar;
        for(int i=0;i<num;i++){
            if(s.charAt(i)=='a'){
                ++newCount;
            }
        }
         cnt=(count*substr)+newCount;
    }
    System.out.println("count : "+count+" substr : "+substr+" newCount : "+newCount);
    return cnt;
}
}

public class Main
{
	public static void main(String[] args) {
	    Result rs= new Result();
	    System.out.println("a==>"+rs.repeatedString("aba",10));
	}
}
