package in.LinkedList.Basic;


import in.LinkedList.ListNode;
import in.LinkedList.SingleLinkedList;

/**
 * Created by satheeesh on 11/8/16.
 */
public class NthNodeFromEnd {

    public static ListNode getNthNodeFromEnd(SingleLinkedList singleLinkedList, int n) {
        ListNode temp = singleLinkedList.getHead();
        ListNode nthPositionNode = moveNPositionAhead(temp, n);
        if (n <=0 ) {
            return null;
        }
        if (nthPositionNode == null) {
            return nthPositionNode;
        }
        while (nthPositionNode.getNext() != null) {
            nthPositionNode = nthPositionNode.getNext();
            temp = temp.getNext();
        }
        return temp;
    }

    private static ListNode moveNPositionAhead(ListNode temp, int n) {
        for (int i = 0; i < n-1; i++) {
            if (temp == null) {
                return temp;
            }
            temp = temp.getNext();
        }
        return temp;
    }
}
