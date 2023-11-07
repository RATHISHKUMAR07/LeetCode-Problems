package Medium;
import java.util.*;
public class GroupOfAnagrams {

	public static void main(String[] args) {
		String[] str = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(str));

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
        
		List<List<String>> anagrams = new ArrayList<>();
		String[] str = countAnagram(strs);

		for(int a=0;a<str.length;a++) {
			if(!(str[a].equals("*"))) {
				List<String> list  = new ArrayList<>();
				list.add(strs[a]);
				for(int b=0;b<str.length;b++) {
					if(a != b) {
						
						if(!str[b].equals("*")) {
							if(isAnagram(str[a],str[b])) {
								list.add(strs[b]);
								str[b] = "*";
							}
						}
						else {
							continue;
						}
						
					}
				}
				str[a] = "*";
				anagrams.add(list);
			}
			
		}
		return anagrams;
    }
	public static boolean isAnagram(String s1, String s2) {
		StringBuilder sb = new StringBuilder(s2);
	
		int flag = 0;
		for(int i=0;i<s1.length();i=i+2) {
			flag = 0;
			for(int j=0;j<sb.length();j=j+2) {
				boolean bool = (s1.substring(i,i+2)).equals((sb.substring(j,j+2)).toString());
				if(bool) {
					sb.deleteCharAt(j);
					sb.deleteCharAt(j);
					flag = 1;
				}
			}
			if(flag == 0)
				return false;
		}
		return true;
		
	}
	public static String[] countAnagram(String[] str) {
		String[] st = new String[str.length];
		for(int i=0;i<str.length;i++) {
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<str[i].length();j++) {
				sb.append(str[i].charAt(j));
				sb.append("1");
			}
			st[i] = sb.toString();
		} 
		return st;
	}
}

//public List<List<String>> groupAnagrams(String[] strs) {
//    Map<String, List<String>> map = new HashMap<>();
//    
//    for (String word : strs) {
//        char[] chars = word.toCharArray();
//        Arrays.sort(chars);
//        String sortedWord = new String(chars);
//        
//        if (!map.containsKey(sortedWord)) {
//            map.put(sortedWord, new ArrayList<>());
//        }
//        
//        map.get(sortedWord).add(word);
//    }
//    
//    return new ArrayList<>(map.values());
//}
