package in.LinkedList.DriverPrograms;

import in.LinkedList.SingleLinkedList;

/**
 * Created by satheeesh on 10/8/16.
 */
public class DriverProgramForDeletionAtPosition {

    public static void main(String args[]) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertNewNode(100);
        singleLinkedList.insertNewNode(500);
        singleLinkedList.insertNewNode(600);
        singleLinkedList.insertNewNode(800);
        singleLinkedList.insertNewNode(900);
     /*   singleLinkedList.deleteNodeAtPosition(5);
        singleLinkedList.deleteNodeAtPosition(0);
        singleLinkedList.traverse();*/
        System.out.println(singleLinkedList.countNumberOfNodes());
    }
}
