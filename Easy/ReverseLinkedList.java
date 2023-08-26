package Easy;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
	}
	public class ListNode{
		int data;
		ListNode next;
		ListNode() {}
		 ListNode(int val) { this.data = val; }
		 ListNode(int val, ListNode next) { this.data = val; this.next = next; }
	}
	
	public ListNode reverseList(ListNode head) {
        ListNode nextNode = head;
        ListNode prevNode = null;
        ListNode currentNode = head;
    
        while(nextNode != null){
            nextNode = nextNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
        return head;
    }

}

