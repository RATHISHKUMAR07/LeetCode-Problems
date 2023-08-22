package Easy;

public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isSubsequence(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int count = 0;
        if(len1 == 0){
            return true;
        }
        else{
            int pos = 1;
            int i = 0;
            for(int j=0;j<len2 && len1 != i;j++){
                if(s.charAt(i) == t.charAt(j)){
                    i++;
                    count++;
                }
            }
        }
        if(count == len1)
            return true;
        else
            return false;
        
    }

}
