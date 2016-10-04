import in.LinkedList.Basic.NthNodeFromEnd;
import in.LinkedList.Basic.Operations;
import in.LinkedList.SingleLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by satheeesh on 11/8/16.
 */
public class NthNodeFromEndTest {

    SingleLinkedList singleLinkedList = new SingleLinkedList();

    @Before
    public void init() {
        singleLinkedList.insertNewNode(100);
        singleLinkedList.insertNewNode(500);
        singleLinkedList.insertNewNode(600);
        singleLinkedList.insertNewNode(800);
        singleLinkedList.insertNewNode(900);
    }

    @Test
    public void testNthNodeFromEnd() {
        Assert.assertEquals(NthNodeFromEnd.getNthNodeFromEnd(singleLinkedList, 5).getData(), 100);
        Assert.assertEquals(NthNodeFromEnd.getNthNodeFromEnd(singleLinkedList, 1).getData(), 900);
        Assert.assertEquals(NthNodeFromEnd.getNthNodeFromEnd(singleLinkedList, 2).getData(), 800);
        Assert.assertEquals(NthNodeFromEnd.getNthNodeFromEnd(singleLinkedList, 4).getData(), 500);
    }
}
