/*
Alice thinks of a non-decreasing sequence of non-negative integers and wants Bob to guess it by providing him the set of all its K-sums with repetitions.

What is this? Let the sequence be {A[1], A[2], ..., A[N]} and K be some positive integer that both Alice and Bob know. Alice gives Bob the set of all possible values that can be genereated by this - A[i1] + A[i2] + ... + A[iK], where 1 ≤ i1 ≤ i2 ≤ ... ≤ iK ≤ N. She can provide the values generated in any order she wishes to. Bob's task is to restore the initial sequence.

Consider an example. Let N = 3 and K = 2. The sequence is {A[1], A[2], A[3]}. The sequence of its 2-sums with repetitions is {A[1] + A[1], A[1] + A[2], A[1] + A[3], A[2] + A[2], A[2] + A[3], A[3] + A[3]}. But its elements could be provided in any order. For example any permutation of {2, 3, 4, 4, 5, 6} corresponds to the sequence {1, 2, 3}.

Input Format

The first line of the input contains an integer T denoting the number of test cases.
The description of T test cases follows.
The first line of each test case contains two space separated integers N and K.
The second line contains the sequence Si of all K-sums with repetitions of the sequence Alice initially thought of.

Constraints

Note
The total number of elements in any input sequence does not exceed 105
Each element of each input sequence is non-negative integer not exceeding 1018.
Each input sequence is a correct sequence of all K-sums with repetitions of some non-decreasing sequence of non-negative integers.

Output Format

For each test case, output a single line containing the space separated list of elements of the non-decreasing sequence Alice thinks of. If there are several possible outputs you can output any of them.

Sample Input 0

3
1 3
3
2 2
12 34 56
3 2
2 3 4 4 5 6
Sample Output 0

1
6 28
1 2 3
Explanation 0

Sample case #00: When N = 1 and K = 3 the only K-sum is S[1] = 3 * A[1]. Hence A[1] = S[1] / 3 = 3 / 3 = 1.

Sample case #01: Since 6 + 6 = 12, 6 + 28 = 34, 28 + 28 = 56, then Alice indeed could think of the sequence {6, 28}.

Sample case #02: It corresponds to the example in the problem statement.
*/
/*_________________________________________________________________________*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
        
        Long p = in.nextLong();
        
        for(long m = 0; m < p; m++) {
            long n = in.nextLong();//elements
            long k = in.nextLong();//sums
            
            ArrayList<Long> kSums = new ArrayList<Long>();

            long l = 1;
            if (n - 1 >= k) {
                for(long i = n + k - 1; i > n - 1; i--) {
                    l *= i;
                }
                for(long i = k; i > 1; i--) {
                    l /= i;
                }
            } else {
                for(long i = n + k - 1; i > k; i--) {
                    l *= i;
                }
                for(long i = n - 1; i > 1; i--) {
                    l /= i;
                }
            }
            
            for(long i = 0; i < l; i++) {
                kSums.add(in.nextLong());
            }
            
            kSums.sort(null);
            
            ArrayList<Long> list2 = new ArrayList<Long>();
            
            list2.add(kSums.get(0) / k);
            
            if (n > 2) {
                for(int i = 1; i < kSums.size(); i++) {
                    if (kSums.get(i) != kSums.get(0)) {
                        list2.add(kSums.get(i) - ((kSums.get(0) / k) * (k - 1)));
                        break;
                    }
                }
            }
            
            ArrayList<Long> list3 = new ArrayList<Long>();
            getKSum(list2, k, 0, 0, list3);

            while (list3.size() != l) {
                ArrayList<Long> list4 = (ArrayList<Long>) kSums.clone();
                for(long i : list4) {
                    if (!list3.remove((Long) i)) {
                        list2.add(i - list2.get(0) * (k - 1));
                        list3.clear();
                        getKSum(list2, k, 0, 0, list3);
                        break;
                    }
                }
                
                
            }
            
            list2.sort(null);
            for(long i : list2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        in.close();
    }
    
    private static void getKSum(ArrayList<Long> l, long k, int i, long s, ArrayList<Long> r){
        for(; i < l.size(); i++) {
            if (k == 1) {
                r.add(s + l.get(i));
            } else {
                getKSum(l, k - 1, i, s + l.get(i), r);
            }
        }
    }
}