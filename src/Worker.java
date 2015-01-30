public class Worker extends Employee
{
    private String boss;
    private String department;

    public Worker(String name, String ssn, double salary, String boss,
            String department)
    {
        super(name, ssn, salary);
        this.boss = boss;
        this.department = department;
    }

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

    @Override
    public String toString()
    {
        String result = "Name: " + this.getName() + "\nSSN#: " + this.getSsn()
                + "\nSalary: $" + this.getSalary() + "\nBoss: Mr. or Ms. "
                + this.getBoss() + "\nDepartment: " + this.getDepartment()
                + "\n";
        return result;
    }

}
