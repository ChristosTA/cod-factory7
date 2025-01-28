package gr.aueb.cf.ch14;

public class Employee extends  Person{
    private  double salary;

    public Employee() {

    }

    public Employee(long id, String firstname, String lastname, double salary) {
        super(id, firstname, lastname);
        this.salary = salary;
    }
}
