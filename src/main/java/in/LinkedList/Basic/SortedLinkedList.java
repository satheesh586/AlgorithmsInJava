package in.LinkedList.Basic;


import in.LinkedList.ListNode;
import in.LinkedList.SingleLinkedList;

/**
 * Created by satheeesh on 10/8/16.
 */
public class SortedLinkedList {

    public static void removeDuplicateElement(SingleLinkedList singleLinkedList) {//Assume given Linked List is sorted and has no cycles
        ListNode temp = singleLinkedList.getHead().getNext(), tempPrevious = singleLinkedList.getHead();
        while(temp != null) {
            if (temp.getData() == tempPrevious.getData()) {
                tempPrevious.setNext(temp.getNext());
                temp = temp.getNext();
                continue;
            }
            temp = temp.getNext();
            tempPrevious = tempPrevious.getNext();
        }
    }
}
