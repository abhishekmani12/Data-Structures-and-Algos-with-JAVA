package dsandalgo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        Employee johnlark=new Employee("John","Lark", 937);
        Employee ethanhunt=new Employee("Ethan","Hunt", 739);
        Employee benjidunn=new Employee("Benji","Dunn", 782);

        //Inserting nodes to Linked List:

        EmployeeLinkedList list=new EmployeeLinkedList();
        list.addToFront(johnlark);
        list.addToFront(ethanhunt);
        list.addToFront(benjidunn);

        //Printing the Linked List:

        list.printList();

        //Size of the ll:

        System.out.println("Size= "+list.getSize());

        //Checking if ll is empty:

        System.out.println(list.isEmpty());

        //Deleting a node from ll:

        list.removeFromFront();
        list.printList();
        System.out.println("Size= "+list.getSize());
        
    }
}
