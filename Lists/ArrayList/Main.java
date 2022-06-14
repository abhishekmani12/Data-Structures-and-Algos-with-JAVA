package dsandalgo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> EmployeeList=new ArrayList<>(); //ArrayList Class implementing List interface

        //Add method: -- adds to the end by default

        EmployeeList.add(new Employee("John","Lark", 937));
        EmployeeList.add(new Employee("Ethan","Hunt", 739));
        EmployeeList.add(new Employee("Benji","Dunn", 782));

        // forEach Method: Printing

        EmployeeList.forEach(Employee->System.out.println(Employee));

        //get Method:

        System.out.println(EmployeeList.get(2));

        //isEmpty Method:

        System.out.println(EmployeeList.isEmpty());  //returns boolean

        //set Method:--replaces by specifying the index

        EmployeeList.set(2, new Employee("Illsa","Faust", 294));

       //size Method:-- gives the total number of items in the list

        System.out.println(EmployeeList.size());

        //Add by specifying the index:

        EmployeeList.add(2, new Employee("Solomon","Lane", 192));

        //contains Method: Should implement equals method in Employee class

        System.out.println(EmployeeList.contains(new Employee("Solomon","Lane",192)));

        //indexOf Method: Fetches the index

        System.out.println(EmployeeList.indexOf(new Employee("Ethan","Hunt",739)));

        //remove Method:

        EmployeeList.remove(2);
        EmployeeList.forEach(Employee->System.out.println(Employee));
        
    }
}
