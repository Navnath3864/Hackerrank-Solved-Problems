/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) { 
       /*
         * Write your code here.
         
         */
         int sum=0;
         for(int i=0;i<keyboards.length;i++){
             for(int j=0;j<drives.length;j++){
                 int newsum=keyboards[i]+drives[j];
                 if(newsum<b && newsum>sum){
                     sum=newsum;
                 }
             }
         }
         return sum;
    }

	public static void main(String[] args) {
	    int keyboards[]={3,1};
	    int drives[]={5,2,8};
	    int b=10;
	    System.out.println(getMoneySpent(keyboards,drives,b));
	}
}
