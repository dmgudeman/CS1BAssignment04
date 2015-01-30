/**
 * This is a test driver for the employees LinkedList
 */

public class EmployeeTestList
{
    public static void main(String[] args)
    {

        EmployeeList employeeList = new EmployeeList();
        double percentRaise = .5;

        Employee manager20 = new Manager("Brent", "123123", 10000.0, "dufus",
                1.0);
        employeeList.add(manager20);
        manager20.raise(percentRaise);

        Employee worker200 = new Worker("Tommy", "123123", 10000.0, "dufus",
                "naval reflection");
        employeeList.add(worker200);
        worker200.raise(percentRaise);

        Employee employee1 = new Employee("Ted", "123123", 10000.0);
        employeeList.add(employee1);
        employee1.raise(percentRaise);

        Employee employee2 = new Employee("Sparky", "134343", 20000.0);
        employeeList.add(employee2);
        employee2.raise(percentRaise);

        Employee employee3 = new Employee("Axl", "123123", 10000.0);
        employeeList.add(employee3);

        Employee employee4 = new Employee("Eddie", "134343", 20000.0);
        employeeList.add(employee4);

        Employee employee5 = new Employee("Mick", "134343", 20000.0);
        employeeList.add(employee5);


        System.out.println(employeeList.toString());
        employeeList.raise(percentRaise);
        System.out.println(employeeList.toString());

    }
}
/**********
  Name: Brent
SSN#: 123123
Salary: $15000.0
Bonus: $1.0
Title Mr. or Ms. dufus

 Name: Tommy
SSN#: 123123
Salary: $15000.0
Boss: Mr. or Ms. dufus
Department: naval reflection

 Name: Ted
SSN#: 123123
Salary: $15000.0

 Name: Sparky
SSN#: 134343
Salary: $30000.0

 Name: Axl
SSN#: 123123
Salary: $10000.0

 Name: Eddie
SSN#: 134343
Salary: $20000.0

 Name: Mick
SSN#: 134343
Salary: $20000.0


 Name: Brent
SSN#: 123123
Salary: $22500.0
Bonus: $1.0
Title Mr. or Ms. dufus

 Name: Tommy
SSN#: 123123
Salary: $22500.0
Boss: Mr. or Ms. dufus
Department: naval reflection

 Name: Ted
SSN#: 123123
Salary: $22500.0

 Name: Sparky
SSN#: 134343
Salary: $45000.0

 Name: Axl
SSN#: 123123
Salary: $15000.0

 Name: Eddie
SSN#: 134343
Salary: $30000.0

 Name: Mick
SSN#: 134343
Salary: $30000.0
 */
