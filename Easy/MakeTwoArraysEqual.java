package Easy;

public class MakeTwoArraysEqual {

	public static void main(String[] args) {
		int[] target = {1,2,2,3};
		int[] arr = {1,1,2,3};
		System.out.println(canBeEqual(target, arr));
	}
	public static boolean canBeEqual(int[] target, int[] arr) {
        int[] numberCount = new int[1001];
        for(int i = 0;i<target.length;i++){
            numberCount[arr[i]]++;
            numberCount[target[i]]--;
        }
        for(int x : numberCount){
            if(x != 0)
                return false;
        }
        return true;
    }

}
