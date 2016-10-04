package in.LinkedList.Basic;

import in.LinkedList.ListNode;
import in.LinkedList.SingleLinkedList;

/**
 * Created by satheeesh on 11/8/16.
 */
public class Operations {

    public static ListNode getMiddleNode(SingleLinkedList singleLinkedList) {
        ListNode fastPointer = singleLinkedList.getHead();
        ListNode slowPointer = singleLinkedList.getHead();
        while(fastPointer != null){
            fastPointer = fastPointer.getNext();
            if (fastPointer == null) {
                break;
            }
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext();
        }
        return slowPointer;
    }
}
