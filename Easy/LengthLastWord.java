package Easy;

public class LengthLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int lengthOfLastWord(String s) {
	        int count = 0;
	        int flag = 0;
	        for(int i = s.length() - 1;i>=0;i--){
	            if(s.charAt(i) != ' '){
	                count++;
	                flag = 1;
	            }
	            else if(flag == 0){
	                continue;
	            }
	            else{
	                break;
	            }
	        }
	        return count;
	    }

}
