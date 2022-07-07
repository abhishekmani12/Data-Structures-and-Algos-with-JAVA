package dsandalgo;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue; //backing array for queue

    //pointers for front and back of the queue
    private int front; //changes for dequeue
    private int back;  //changes for enqueue

    public ArrayQueue(int capacity)
    {
        queue= new Employee[capacity]; //initializing queue with capacity
    }

    //ENQUEUE Method:

    public void add(Employee employee)
    {
        //Resizing arr by creating new arr of double the length and copying existing elements, if space is not sufficient

        if(back==queue.length)
        {
           Employee[] newArr=new Employee[2* queue.length];
           System.arraycopy(queue, 0, newArr, 0, queue.length);
           queue=newArr;
        }

        queue[back]=employee; //assigning the new employee to the current back position in the queue(arr)
        back++;//incrementing back to the next available position
    }

    //Size method:

    public int size()
    {
        return back-front;
    }

    //DEQUEUE Method:

    public Employee remove() {

        if(size()==0)
        {
            throw new NoSuchElementException();
        }

        Employee employee=queue[front];
        queue[front]=null;
        front++;

        if(size()==0)  //resetting pointers to represent an empty queue if size==0
        {
            front=0;
            back=0;
        }

        return employee;
    }

    //Peek Method:

    public Employee peek()
    {
        if(size()==0)
        {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    //Print Queue Method:

    public void printQueue()
    {
        for(int i=front;i<back;i++)
        {
            System.out.println(queue[i]);
        }
    }
}
