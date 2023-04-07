package Stack.Implementation;

import Stack.Exception.StackEmptyException;

public class Stack {

    private Object[] elements;
    private  int length;

    public Stack(int lengthValue) {
        this.elements = new Object[lengthValue];
    }

    public boolean isEmpty() {
        if(length == 0) return true;
        else return false;
    }

    public int length() {
        return this.length;
    }

    public void push(Object value) {
        this.elements[length] = value;
        this.length++; 
    }

    public Object firstElement() {
        return this.elements[length - 1];
    }

    public Object pop() {
        if(this.isEmpty()) {
            throw new StackEmptyException("Unable to pop because there are no elements on the stack");
        }
        Object firstElement = this.firstElement();
        length--;
        return firstElement;
    }
    
}