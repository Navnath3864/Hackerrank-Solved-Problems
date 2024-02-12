// only function or logic is available 

public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
         Integer max = Collections.max(height);
         int val=max-k;
         if(val<=0){
             return 0;
         }
         else{
             return val;
         }
           

    }

}