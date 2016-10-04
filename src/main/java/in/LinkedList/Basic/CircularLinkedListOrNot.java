package in.LinkedList.Basic;

import in.LinkedList.ListNode;
import in.LinkedList.SingleLinkedList;

/**
 * Created by satheeesh on 10/8/16.
 */
/*Given a singly linked list,
find if the linked list is circular or not.
A linked list is called circular if it not NULL terminated and all nodes are connected in the form of a cycle. ot
Below is an example of circular linked list.
An empty linked list is considered as circular.
Note that this problem is different from cycle detection problem, here all nodes have to be part of cycle.*/

public class CircularLinkedListOrNot {

    public static boolean isCircularOrNot(SingleLinkedList singleLinkedList) {
        ListNode head = singleLinkedList.getHead(), temp, tempPrevious;
        if (head == null) {
            return true;
        }
        else {
            tempPrevious = head;
            temp = tempPrevious.getNext();
            while (tempPrevious != null && temp != null) {
                if (temp == tempPrevious) {
                    return true;
                }
                if (temp.getNext() != null) {
                    temp = temp.getNext().getNext();
                }
                else {
                    break;
                }
                tempPrevious = tempPrevious.getNext();

            }
        }
        return false;
    }
}
