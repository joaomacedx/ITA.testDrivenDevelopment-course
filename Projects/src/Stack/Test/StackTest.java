package Stack.Test;
import static org.junit.Assert.*;

import Stack.Implementation.Stack;

import org.junit.Test;

public class StackTest {

    @Test
    public void emptyStack() {
        Stack stack = new Stack(10);
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.length());
    }
}