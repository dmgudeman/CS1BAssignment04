public class Manager extends Employee
{
    private String title;
    private double bonus;

    public Manager(String name, String ssn, double salary, String title,
            double bonus)
    {
        super(name, ssn, salary);
        title = this.title;
        bonus = this.bonus;
    }

    public Manager()
    {
        super();
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    @Override
    public String toString()
    {
        String result = "Name: " + this.getName() + "\nSSN#: " + this.getSsn()
                + "\nSalary: $" + this.getSalary() + "\nBonus: $"
                + this.getBonus() + "\nTitle Mr. or Ms. " + this.getTitle()
                + "\n";
        return result;
    }
}
