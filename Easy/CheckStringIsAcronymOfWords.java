package Easy;

import java.util.List;

public class CheckStringIsAcronymOfWords {

	public static void main(String[] args) {
//		Input: words = ["alice","bob","charlie"], s = "abc"
//				Output: true
//				Explanation: The first character in the words 
//				"alice", "bob", and "charlie" are 'a', 'b', and 'c', respectively. 
//				Hence, s = "abc" is the acronym. 
	}
	public boolean isAcronym(List<String> words, String s) {
	        StringBuilder t = new StringBuilder();
	        for (String w : words) 
	            t.append(w.charAt(0));
	            
	        return t.toString().equals(s);
	   }

}
