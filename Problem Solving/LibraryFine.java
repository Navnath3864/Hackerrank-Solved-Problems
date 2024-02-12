/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    // Write your code here
    int sum1=d1+m1+y1;
    int sum2=d2+m2+y2;
    int fine=0;
    if(y1>y2 || (y1==y2 && m1>m2) || (y1==y2 && m1==m2 && d1>d2)){
        if(y1!=y2){
            fine=10000;
        }
        else{
            if(m1!=m2){
                fine=(m1-m2)*500;
            }
            else{
                if(d1!=d2){
                    fine=15*(d1-d2);
                }
            }
        }
    }
    else{
        fine=0;
    }
    return fine;
    }
	public static void main(String[] args) {
		System.out.println(libraryFine(2,7,1014,1,1,1015));
	}
}
