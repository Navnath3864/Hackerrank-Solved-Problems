/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int beautifulDays(int i, int j, int k) {
    // Write your code here
        int count=0;
        
        for(int a=i;a<=j;a++){
            int div=0;
            int reverseNum=0;
           int num=a;
            while(num>0){
                int temp=num%10;
                reverseNum=(reverseNum*10)+temp;
                num=num/10;
               
            }
          //  System.out.println(reverseNum);
            if(a-reverseNum==0){
                count=count+1;
            }
            else{
                div=(a-reverseNum);
                if(div%k==0){
                count=count+1;
                }
            }
            
        }
        return count;
    }


	public static void main(String[] args) {
		System.out.println(beautifulDays(20,23,6));
		
	}
}
