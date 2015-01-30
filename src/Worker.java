public class Worker extends Employee
{
    private String boss;
    private String department;
    
    // constructor that adds to employee two variables specific
    // to each worker
    public Worker(String name, String ssn, double salary, String boss,
            String department)
    {
        super(name, ssn, salary);
        this.boss = boss;
        this.department = department;
    }
    // default constructor
    public Worker()
    {
        super();
    }

    public String getBoss()
    {
        return boss;
    }

    public void setBoss(String boss)
    {
        this.boss = boss;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    //returns information about each worker object
    @Override
    public String toString()
    {
        String result = super.toString() + "Boss: Mr. or Ms. "
                + this.getBoss() + "\nDepartment: " + this.getDepartment()
                + "\n";
        return result;
    }

}
