package in.LinkedList.DriverPrograms;


import in.LinkedList.Basic.CircularLinkedListOrNot;
import in.LinkedList.SingleLinkedList;

/**
 * Created by satheeesh on 10/8/16.
 */
public class DriverForIsCircularOrNot {
    public static void main(String args[]) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertNewNode(100);
        singleLinkedList.insertNewNode(500);
        singleLinkedList.insertNewNode(600);
        singleLinkedList.insertNewNode(800);
        singleLinkedList.insertNewNode(900);
        singleLinkedList.getNodeAtPosition(4).setNext(singleLinkedList.getNodeAtPosition(10));
        System.out.println(singleLinkedList.getNodeAtPosition(4).getData());
        System.out.println(CircularLinkedListOrNot.isCircularOrNot(singleLinkedList));
    }
}
