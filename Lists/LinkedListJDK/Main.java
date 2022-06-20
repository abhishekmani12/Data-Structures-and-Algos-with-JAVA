package dsandalgo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        Employee johnlark=new Employee("John","Lark", 937);
        Employee ethanhunt=new Employee("Ethan","Hunt", 739);
        Employee benjidunn=new Employee("Benji","Dunn", 782);

        LinkedList<Employee> list=new LinkedList<>();


        //Adding Elements:

        list.addFirst(johnlark);

        //add at the tail

        list.add(ethanhunt); //(OR) list.addLast(ethanhunt);

        list.addFirst(benjidunn);

        //Printing:

        //Using iterator:

        Iterator i=list.iterator();
        System.out.println("HEAD -> ");
        while(i.hasNext())
        {
            System.out.print(i.next());
            System.out.println(" <-> ");
        }
        System.out.println("NULL");

        //Using loop:

        for(Employee employee: list)
        {
            System.out.println(employee);
        }

        //Removing from first:

        list.removeFirst();//parameter is not passed as it is not needed
        list.remove();

        //Removing from last:

        list.removeLast();


    }
}
