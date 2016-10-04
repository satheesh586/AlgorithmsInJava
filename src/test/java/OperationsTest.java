import in.LinkedList.Basic.Operations;
import in.LinkedList.SingleLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by satheeesh on 11/8/16.
 */

public class OperationsTest {

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
    public void testGetMiddleNode() {
        Assert.assertEquals(Operations.getMiddleNode(singleLinkedList).getData(), 600);
        singleLinkedList.deleteNodeAtPosition(0);
        Assert.assertEquals(Operations.getMiddleNode(singleLinkedList).getData(), 800);
        singleLinkedList.deleteNodeAtPosition(0);
        Assert.assertEquals(Operations.getMiddleNode(singleLinkedList).getData(), 800);
        singleLinkedList.deleteNodeAtPosition(0);
        Assert.assertEquals(Operations.getMiddleNode(singleLinkedList).getData(), 900);
    }


}
