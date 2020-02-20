package arraysort.practiceds1;

import java.util.LinkedList;
import java.util.ListIterator;

import arraysort.practiceds1.Message;

public class StackForMessage<T>{

    private LinkedList<Message> stack;

    public StackForMessage() {
        stack = new LinkedList<Message>();
    }

    public void push(Message msg) {
        stack.push(msg);
    }

    public Message pop() {
        return stack.pop();
    }

    public Message peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Message> iterator = stack.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

