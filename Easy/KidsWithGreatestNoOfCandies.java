package Easy;

import java.util.ArrayList;

public class KidsWithGreatestNoOfCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        ArrayList<Boolean> bool = new ArrayList<Boolean>();
        for(int j = 0;j<candies.length;j++){
            if(candies[j] + extraCandies >= max)
                bool.add(true);
            else
                bool.add(false);
        }
        return bool;
    }

}
