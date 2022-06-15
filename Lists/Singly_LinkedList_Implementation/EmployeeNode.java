//node class which has employee field and object ref field

package dsandalgo;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;
    
    //Getters and Setters

    public EmployeeNode(Employee employee)
    {
        this.employee=employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    //printing out the employee info instead of the reference

   public String toString()
   {
       return employee.toString();
   }
}
