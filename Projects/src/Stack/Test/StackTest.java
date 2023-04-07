package Stack.Test;
import static org.junit.Assert.*;

import org.junit.Before;

import Stack.Exception.StackEmptyException;
import Stack.Implementation.Stack;

import org.junit.Test;

public class StackTest {

    private Stack stack;

    @Before
    public void initStack() {
        stack = new Stack(10);
    }
    @Test
    public void emptyStack() {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.length());
    }
    @Test
    public void pushAnElement() {
        stack.push("first");
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.length());
        assertEquals("first", stack.firstElement());
    }
    @Test
    public void pushAndPop() {
        stack.push("first");
        stack.push("second");
        assertFalse(stack.isEmpty());
        assertEquals(2, stack.length());
        assertEquals("second", stack.firstElement());
        Object popElement = stack.pop();
        assertEquals(1, stack.length());
        assertEquals("first", stack.firstElement());
        assertEquals("second", popElement);
    }
    @Test(expected = StackEmptyException.class) 
    public void removeFromEmptyStack() {
        stack.pop();
    }
}