package TDD;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testAdd() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();
    }
    @Test
    public void testRemove() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(3);
        System.out.println("List after remove");
        list.printList();
    }
    @Test
    public void testEmptyList() {
        LinkedList list = new LinkedList();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }
    
}
