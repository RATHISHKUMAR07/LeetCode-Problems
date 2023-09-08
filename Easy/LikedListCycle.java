package Easy;
import java.util.*;
public class LikedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) {
		 val = x;
		 next = null;
		 }
	}
	public boolean hasCycle(ListNode head) {
        Set<ListNode> aList = new HashSet<>();
        if(head == null)
            return false;
        while(head.next != null){
            if(aList.contains(head.next)){
                return true;
            }
            else{
                aList.add(head.next);
                head = head.next;
            }
        }
        return false;
    }
}

