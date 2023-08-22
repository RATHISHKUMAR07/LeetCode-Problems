package Easy;

public class MergeStringAlternatively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String mergeAlternately(String word1, String word2) {
        String str = "";
        int l1 = word1.length();
        int l2 = word2.length();
        int i,j = 0;
        int high1,high2;
        int flag = 0;
        if(l1>l2){
            high1 = l1;
            high2 = l2;
            flag = 1;
        }
        else{
            high1 = l1;
            high2 = l2;
        }

        if(flag == 1){
            for(i=0,j=0;i<high1;i++){
                if(j != high2){
                str = str + word1.charAt(i);
                str = str + word2.charAt(j);
                j++;
                }
                else {
                    str = str + word1.charAt(i);
                }
            }
        }
        else {
            for(i=0,j=0;j<high2;j++){
                if(i != high1){
                str = str + word1.charAt(i);
                str = str + word2.charAt(j);
                i++;
                }
                else {
                    str = str + word2.charAt(j);
                }
            }
        }
        return str;  
    }
}
