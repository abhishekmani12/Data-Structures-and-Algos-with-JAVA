package dsandalgo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {

        ArrayStack stack=new ArrayStack(10);

        //PUSHING:

        stack.push(new Employee("John","Lark", 937));
        stack.push(new Employee("Ethan","Hunt", 739));
        stack.push(new Employee("Benji","Dunn", 782));


        //PRINTING:

        stack.print();

        //POPPING:

        System.out.println("Popped-> "+stack.pop());

        //PEEKING:

        System.out.println("First Element-> "+stack.peek());

}
}
