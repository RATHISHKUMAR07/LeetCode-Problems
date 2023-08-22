package Easy;

public class ReverseVowelsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int i,j;
        i= 0;
        j = c.length-1;
        while(i < j){
            if((isVowel(c[i]) && isVowel(c[j])) == true){
                swap(c,i,j);
                ++i;
                --j;
            }
            else if(isVowel(c[i]) == true && isVowel(c[j]) == false){
                --j;
            }
            else{
                ++i;
            }
        }
        return String.valueOf(c);
    }
    public static void swap(char[] c, int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
    public static boolean isVowel(char v){
        if(v == 'a' || v == 'e' || v == 'o' || v == 'i' || v == 'u' || 
        v == 'A' || v == 'E' || v == 'O' || v == 'I' || v == 'U')
            return true;
        else
            return false;
    }

}
