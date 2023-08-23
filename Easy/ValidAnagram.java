package Easy;
import java.util.*;
public class ValidAnagram {

	public static void main(String[] args) {
		String s = "acc", t = "cac";
		System.out.println("Anagram : "+isAnagram(s, t));
	}
	public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        if(s.length() != t.length())
        	return false;
        else {
        	for(int a=0;a<s.length();a++) {
        		hm.put(s.charAt(a),0);
        	}
        	for(int i=0;i<s.length();i++)
        	{
//        		valueOperation(hm,s.charAt(i),0);
//        		valueOperation(hm,t.charAt(i),1);
        		hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0) + 1);
        		hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i), 0) - 1);

        	}
        }
        if(ifValueNotZero(hm))
        	return true;
		return false;
    }
//	public static void valueOperation(Map<Character,Integer> map, Character key,int flag) {
//		if(flag == 1)
//			map.put(key,map.getOrDefault(key, 0) + 1);
//		else 
//			map.put(key,map.getOrDefault(key, 0) - 1);
//	}
	public static boolean ifValueNotZero(Map<Character,Integer> map) {
		for(int values : map.values()) {
			if(values > 0)
				return false;
		}
		return true;
	}

}
