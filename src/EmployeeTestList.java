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

        System.out.println(employee1.getSalary());
        Employee employee2 = new Employee("Sparky", "134343", 20000.0);
        employeeList.add(employee2);
        employee2.raise(percentRaise);

        Employee employee3 = new Employee("Axl", "123123", 10000.0);
        employeeList.add(employee3);

        Employee employee4 = new Employee("Eddie", "134343", 20000.0);
        employeeList.add(employee4);

        Employee employee5 = new Employee("Mick", "134343", 20000.0);
        employeeList.add(employee5);

        System.out.println("The total number of employees: "
                + Employee.getNumEmployees() + "\n\n");

        System.out.println(employeeList.toString());

    }
}
/**********
 * The Run******* Please type in new employee's name David Lee Roth Please type
 * in new employee's SSN 234234234 Please type in new employee's Salary 1000000
 * 
 * 
 * 
 * Please type in new employee's name Eddie Van Halen Please type in new
 * employee's SSN 345345345 Please type in new employee's Salary 2000000
 * 
 * 
 * 
 * Please type in new employee's name Axl Rose Please type in new employee's SSN
 * 456456456 Please type in new employee's Salary 3000000
 * 
 * 
 * 
 * Please type in new employee's name Exene Cervenka Please type in new
 * employee's SSN 567567567 Please type in new employee's Salary 4000000
 * 
 * 
 * 
 * Name: David Lee Roth SSN#: 234234234 Salary: $1000000.0
 * 
 * Name: Eddie Van Halen SSN#: 345345345 Salary: $2000000.0
 * 
 * Name: Axl Rose SSN#: 456456456 Salary: $3000000.0
 * 
 * Name: Exene Cervenka SSN#: 567567567 Salary: $4000000.0
 * 
 * The Total Number of Employees: 4
 */
