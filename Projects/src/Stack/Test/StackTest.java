package Stack.Test;
import static org.junit.Assert.*;

import Stack.Implementation.Stack;

import org.junit.Test;

public class StackTest {

    @Test
    public void emptyStack() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.length());
    }
    @Test
    public void pushAnElement() {
        Stack stack = new Stack();
        stack.push("first");
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.length());
        assertEquals("first", stack.firstElement());
    }
    @Test
    public void pushAndPop() {
        Stack stack = new Stack();
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
}