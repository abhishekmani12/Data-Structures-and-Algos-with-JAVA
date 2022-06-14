package dsandalgo;

import java.util.Objects;

public class Employee {

    private String FirstName;
    private String LastName;
    private int id;


    //Constructor

    public Employee(String FirstName,String LastName, int id) {

        this.FirstName = FirstName;
        this.LastName=LastName;
        this.id=id;

    }

    //getters and setters


    public String getFirstName(){
        return FirstName;
    }

    public void setFirstName(String FirstName){
        this.FirstName=FirstName;
    }


    public String getLastName(){
        return LastName;
    }

    public void setLastName(String LastName){
        this.LastName=LastName;
    }


    public int getid(){
        return id;
    }

    public void setid(int id){
        this.id=id;
    }


    //Equals Method:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && FirstName.equals(employee.FirstName) && LastName.equals(employee.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, LastName, id);
    }

    //toString Method:

    @Override
    public String toString()
      {
          return "Employee{" + "Firstname= '" + FirstName + "\'" +
                  ", Lastname= '" + LastName + "\'" +
                  ", Id= " + id + "}";
      }
}
