package Medium;
import java.util.*;
public class ReverseWordInString {

	public static void main(String[] args) {
		System.out.println(reverseWords("  hello world  "));
	}
	public static String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");
        StringBuilder out = new StringBuilder();

        for (int i = str.length - 1; i > 0; i--) {
            out.append(str[i] + " ");
        }
        // Append the first word to the output (without trailing space)
        out.append(str[0]);
        return out.toString();
    }

}
