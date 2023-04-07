package Stack.Implementation;


public class Stack{
    private Object element;
    private  int length;

    public Stack() {
    }

    public boolean isEmpty() {
        if(element == null) return true;
        else return false;
    }

    public int length() {
        return this.length;
    }

    public void push(Object value) {
        this.element = value;
        this.length++; 
    }

    public Object firstElement() {
        return this.element;
    }
    
}