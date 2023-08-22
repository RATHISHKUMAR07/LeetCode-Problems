package Medium;
import java.util.*;
public class RemoveStarsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String removeStars(String s) {
        Stack st = new Stack();
       for(int i = 0;i<s.length();i++){
           if(s.charAt(i) != '*'){
               st.push(s.charAt(i));
           }
           else{
               st.pop();
           }
       }
       StringBuilder stringBuilder = new StringBuilder();
       while (!st.isEmpty()) {
           stringBuilder.append(st.pop());
       }
       return stringBuilder.reverse().toString();

   }

}
