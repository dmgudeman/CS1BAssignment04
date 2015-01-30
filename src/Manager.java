/**
 * Class adds new information about each employee that is a
 * manager
 */

public class Manager extends Employee
{
    private String title;
    private double bonus;

    // Constructor adds to Employee two variables specific to managers
    public Manager(String name, String ssn, double salary, String title,
            double bonus)
    {
        super(name, ssn, salary);
        this.title = title;
        this.bonus = bonus;
    }
    // default constructor
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

    // returns information about each manager object
    @Override
    public String toString()
    {
        String result =  super.toString() + "Bonus: $"
                + this.getBonus() + "\nTitle Mr. or Ms. " + this.getTitle()
                + "\n";
        return result;
    }
}
