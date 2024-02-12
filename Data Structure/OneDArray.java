/*
Let's play a game on an array! You're standing at index  of an -element array named . From some index  (where ), you can perform one of the following moves:

Move Backward: If cell  exists and contains a , you can walk back to cell .
Move Forward:
If cell  contains a zero, you can walk to cell .
If cell  contains a zero, you can jump to cell .
If you're standing in cell  or the value of , you can walk or jump off the end of the array and win the game.
In other words, you can move from index  to index , , or  as long as the destination index is a cell containing a . If the destination index is greater than , you win the game.

Function Description

Complete the canWin function in the editor below.

canWin has the following parameters:

int leap: the size of the leap
int game[n]: the array to traverse
Returns

boolean: true if the game can be won, otherwise false
Input Format

The first line contains an integer, , denoting the number of queries (i.e., function calls).
The  subsequent lines describe each query over two lines:

The first line contains two space-separated integers describing the respective values of  and .
The second line contains  space-separated binary integers (i.e., zeroes and ones) describing the respective values of .
Constraints

It is guaranteed that the value of  is always .
Sample Input

STDIN           Function
-----           --------
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0
Sample Output

YES
YES
NO
NO
Explanation

We perform the following  queries:

For  and , we can walk and/or jump to the end of the array because every cell contains a . Because we can win, we return true.
For  and , we can walk to index  and then jump  units to the end of the array. Because we can win, we return true.
For  and , there is no way for us to get past the three consecutive ones. Because we cannot win, we return false.
For  and , there is no way for us to get past the one at index . Because we cannot win, we return false.
*/
/*____________________________________________________________________________*/

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
         int index = 0;
        ArrayList<Integer> added = new ArrayList<Integer>();
        
        
        if(game[index+1] == 0)
            added.add(index+1);
        if(index-1>=0 && game[index-1] == 0)
            added.add(index-1);
        if(index+leap<game.length && game[index+leap] == 0)
            added.add(index+leap);
        if(leap >= game.length)
            return true;

        
        int bufferLength = 0;
        while(true)
        {
            int count = 0;
            bufferLength = added.size();
            while(count < added.size())
            {
                if((added.get(count) + leap > game.length - 1) || (added.get(count) + 1 > game.length-1))
                    return true;
                if(game[added.get(count) + 1] == 0)
                {
                    if(!added.contains(added.get(count) + 1))
                        added.add(added.get(count) + 1);
                }
                if(added.get(count)-1>=0 && game[added.get(count) - 1] == 0)
                {
                    if(!added.contains(added.get(count) - 1))
                        added.add(added.get(count) - 1);
                }
                if(game[added.get(count) + leap] == 0)
                {
                    if(!added.contains(added.get(count) + leap))
                        added.add(added.get(count) + leap);
                }

                count ++;

            }
            if(bufferLength == added.size()) // meaning added didnt change in length so no new items were added
                return false;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
