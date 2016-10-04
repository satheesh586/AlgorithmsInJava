package in.LinkedList;

/**
 * Created by satheeesh on 10/8/16.
 */
public class SingleLinkedList {

    private ListNode head;

    public SingleLinkedList() {

    }

    public void deleteNodeAtPosition(int position) { //First element positioned at zero position
        ListNode temp = head, tempPrevious = head;
        int count = 0;

        while (tempPrevious.getNext() != null) {
            if (count == position) {
                if (position == 0) {
                    head = head.getNext();
                    break;
                } else {
                    tempPrevious.setNext(temp.getNext());
                    break;
                }
            }
            count++;
            tempPrevious = temp;
            temp = temp.getNext();
        }
    }

    public void insertNewNode(int data) {
        ListNode temp = head;
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        }
        else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    public void insertNodeAtPosition(int position) {

    }

    public int countNumberOfNodes() {//Assume cycle does not exist otherwise we need to check cycles exist
                                         // Try on your own how to count number of nodes if cycle exist
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public ListNode getNodeAtPosition(int position) {
        ListNode temp = head;
        int count = 0;
        while(temp != null) {
            if(count == position) {
                return temp;
            }
            count++;
            temp = temp.getNext();
        }
        return temp;
    }

    public void traverse() {
        ListNode temp = head;
        while(temp != null) {
            System.out.println(temp.data + "--->");
            temp = temp.getNext();
        }
    }


    public ListNode getHead() {
        return head;
    }
}
