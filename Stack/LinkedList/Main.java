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

        LinkedStack stack=new LinkedStack();

        stack.push(johnlark);
        stack.push(ethanhunt);
        stack.push(benjidunn);

        //PRINTING:

        stack.printStack();

        // POPPING:

        System.out.println("Popped-> "+stack.pop());

        //PEEKING:

        System.out.println("First Element-> "+stack.peek());

}
}
