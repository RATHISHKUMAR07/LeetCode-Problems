package Easy;
import java.util.*;
public class PathCrossing {

	public static void main(String[] args) {
		System.out.println(isPathCrossing("NESW"));

	}
	public static boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        set.add("(0,0)");
        int x = 0,y = 0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i) == 'N')
                y++;
            else if(path.charAt(i) == 'S')
                y--;
            else if(path.charAt(i) == 'E')
                x++;
            else
                x--;

            String s = "("+ x + "," + y + ")";
            if(set.contains(s))
                return true;
            else 
                set.add(s);
        }
        return false;
    }

}
