package Easy;


public class PalindromeLinkedList {

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
	public boolean isPalindrome(ListNode head) {
        int number1 = 0;
        int number2 = 0;
        int mul = 1;
        while(head != null){
            number1 = number1 * 10 + head.val;
            number2 = head.val * mul + number2;
            mul = mul * 10;
            head = head.next;
        }
        if(number1 != number2)
            return false;
        return true;
    }

}
