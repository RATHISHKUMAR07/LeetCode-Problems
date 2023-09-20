package Easy;

public class FirstUniqueCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("aello"));
	}
	public static int firstUniqChar(String s) {
	        int hash[] = new int[26];
	        int i =0;
	        int j =s.length() -1;
	        int len = s.length();
	        if(len == 1)
	            return 0;
	        while(i<=j){
	            hash[s.charAt(i) - 97]++;
	            hash[s.charAt(j) - 97]++;
	            i++;
	            j--;
	        }
	       for( i=0;i<len;i++){
	            if(hash[s.charAt(i) - 97] == 1){
	                return i;
	            }
	       }
	       return -1;
	    }

}

