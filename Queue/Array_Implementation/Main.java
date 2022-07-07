package dsandalgo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {

        Employee johnlark=new Employee("John","Lark", 937);
        Employee ethanhunt=new Employee("Ethan","Hunt", 739);
        Employee benjidunn=new Employee("Benji","Dunn", 782);

        ArrayQueue queue=new ArrayQueue(10);

        //ENQUEUE:

        queue.add(johnlark);
        queue.add(ethanhunt);
        queue.add(benjidunn);

        //PRINTING:

        queue.printQueue();

        //DEQUEUE:

        System.out.println("Dequeued-> "+queue.remove());

        //PEEKING:

        System.out.println("First Element-> "+queue.peek());

}
}
