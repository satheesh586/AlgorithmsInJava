package in.LinkedList.DriverPrograms;


import in.LinkedList.Basic.SortedLinkedList;
import in.LinkedList.SingleLinkedList;

/**
 * Created by satheeesh on 10/8/16.
 */
public class DriverForSortedSLL {

    public static void main(String args[]) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertNewNode(200);
        singleLinkedList.insertNewNode(200);
        singleLinkedList.insertNewNode(200);
        singleLinkedList.insertNewNode(200);
        singleLinkedList.insertNewNode(400);
     /*   singleLinkedList.deleteNodeAtPosition(5);
        singleLinkedList.deleteNodeAtPosition(0);
        singleLinkedList.traverse();*/
        SortedLinkedList.removeDuplicateElement(singleLinkedList);
        singleLinkedList.traverse();
        //System.out.println(singleLinkedList.countNumberOfNodes());
    }
}
