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

    @Test
    public void testContains() {
        //This method tests if the contains() works as desired
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertTrue(list.contains(3));
        assertFalse(list.contains(6));
    }
    // TDD aproach is wirting tescases befor implementing of the algorithms.
    @Test
    public void testSize() {
        LinkedList list = new LinkedList();
        assertEquals(0, list.size()); // Test for an empty list

        list.add(1);
        assertEquals(1, list.size());

        list.add(2);
        list.add(3);

        assertEquals(3, list.size());

        list.remove(2);
        assertEquals(2, list.size());
    }
//some comments
}
