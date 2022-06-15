package dsandalgo;

import java.util.concurrent.Callable;

public class EmployeeLinkedList {

    private EmployeeNode head;

    private int size; //Keeps track of the count of the nodes in the ll


    //Insertion Method:

    public void addToFront(Employee employee)
    {
        EmployeeNode node=new EmployeeNode(employee);
        node.setNext(head); //new node points towards the head of the previous first node
        head=node;  //head is set to the new node
        size++;

    }

    //Deletion Method:

    public EmployeeNode removeFromFront()
    {
        if(isEmpty())
        {
            return null;
        }

        EmployeeNode removedNode=head; //As deletion starts from the front

        head=head.getNext(); //Shifting the head to the next node

        size--;
        removedNode.setNext(null);
        return removedNode;


    }

    //Print Method:

    public void printList()
    {
      EmployeeNode Current=head;

      System.out.print("HEAD -> ");

      while(Current!=null)
      {
          System.out.println(Current);

          System.out.print(" -> ");

          Current=Current.getNext();

      }

      System.out.print("Null");
      System.out.println(" ");
    }

    //Size method:
    public int getSize()
    {
        return size;
    }

    //Empty Method:
    public boolean isEmpty()
    {
       return head==null;
    }

}
