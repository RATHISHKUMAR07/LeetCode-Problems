package Easy;
import java.util.*;
public class KeyboardRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"Alaska","Hello","Assd"};
		String[] res = findWords(str);
		for(String s : res) {
			System.out.print(s+" ");
		}
	}
	public static String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();

        for (String word : words) {
            char[] chars = word.toLowerCase().toCharArray();
            if (canBeTypedUsingRow(chars, "qwertyuiop") 
            || canBeTypedUsingRow(chars, "asdfghjkl") 
            || canBeTypedUsingRow(chars, "zxcvbnm")) {
                res.add(word);
            }
        }

        String[] ans = new String[res.size()];
        int i = 0;
        for (String word : res) {
            ans[i++] = word;
        }

        return ans;
    }

    private static boolean canBeTypedUsingRow(char[] chars, String row) {
        for (char c : chars) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

}
