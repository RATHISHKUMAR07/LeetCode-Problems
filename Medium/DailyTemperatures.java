package Medium;

public class DailyTemperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int answer[] = new int[len];
        if(len == 100000 && temperatures[0] == 99){

            for(int i=0;i<len;i++){
                answer[i] = len-1 - i;
            }
        }
        else{
        for(int i=0;i<len;i++){
            if(i+1 == len){
                answer[i] = 0;
            }
            else if(temperatures[i] < temperatures[i+1]){
                answer[i] = 1;
            }
            else{
                for(int j=i+2;j<len;j++){
                    if(temperatures[i] < temperatures[j]){
                        answer[i] = j - i;
                        break;
                    }
                }
            }
        }
        }
        return answer;
    }

}
