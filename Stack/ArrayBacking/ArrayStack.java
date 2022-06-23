package dsandalgo;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack; //Backing array for linked List

    private int top; //Pointer for the top of the stack

    public ArrayStack(int capacity)    //Constructor for the size of the stack
    {
        stack=new Employee[capacity];
    }


    //PUSH METHOD:

    public void push(Employee employee)
    {
       if (top==stack.length)  //if there is no space in backing array, it needs to be resized
       {
           Employee[] newArray=new Employee[2*stack.length];  //Creating new array of double the existing size

           System.arraycopy(stack,0 ,newArray, 0, stack.length); //copying contents of old arr to new arr

           stack=newArray; //assigning stack to new arr
       }

       stack[top++]=employee; //increment top position when pushing a new element
    }


    //IS EMPTY?:


    public boolean isEmpty()
    {
        return top==0;
    }


    //POP METHOD:


    public  Employee pop()
    {
        //Exception:

        if(isEmpty())  //Checks to see if its empty
        {
            throw new EmptyStackException();
        }

        Employee employee=stack[--top];  //Pre Decrementing top as it points to the next available position rather than at the current element

        stack[top]=null; //Making that top postion as NULL
        return employee; //returning deleted employee
    }


    //PEEK METHOD:


    public Employee peek()
    {
        //Exception:

        if(isEmpty())  //Checks to see if its empty
        {
            throw new EmptyStackException();
        }

        return stack[top-1];  //returning the top value of the stack
    }


    //SIZE METHOD:


    public int size()
    {
        return top;
    }


    //PRINT METHOD:


    public void print()
    {
        System.out.println("|-------------------------------------------------------------------|");

        for(int i=top-1;i>=0;i--)  //Prints form top to bottom
        {
            System.out.println(stack[i]);
        }
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println(" ");
    }



}
