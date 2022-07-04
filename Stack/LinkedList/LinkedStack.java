package dsandalgo;

import java.util.LinkedList; //JDK's linked list
import java.util.ListIterator;
//has dequeue interface

public class LinkedStack {

    private LinkedList<Employee> stack; //backing linkedlist limited to only push, pop, peek

    public LinkedStack()
    {
        stack = new LinkedList<Employee>();
    }

    //METHODS:

    public void push(Employee employee)
    {
        stack.push(employee);
    }

    public Employee pop()
    {
        return stack.pop();
    }

    public Employee peek()
    {
        return stack.peek();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public void printStack()
    {
        ListIterator<Employee> iterator=stack.listIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

}
