/**
 * contains a linked list of Employee objects *
 */

public class EmployeeList
{
    private EmployeeListNode first; // references first node in the list
    private EmployeeListNode last; // references last node in list

    /**
     * Constructs an empty list
     */
    public EmployeeList()
    {
        first = null;
        last = null;
    }

    /**
     * Returns true if list is empty
     */
    public boolean isEmpty()
    {
        return first == null && last == null;
    }

    /**
     * Makes a new EmployeeList containing "d" and adds it at the end of list.
     * "d" can be any class of Object.
     */
    public void add(Object d)
    {
        if (isEmpty())
        {
            EmployeeListNode temp;
            temp = new EmployeeListNode(d, null);
            first = temp;
            last = temp;
        }
        else
        {
            EmployeeListNode temp;
            temp = new EmployeeListNode(d, null);
            last.setNext(temp);
            last = temp;
        }
    }

    /**
     * Returns true if "d" is contained in the list, false otherwise.
     */
    public boolean contains(Object d)
    {
        EmployeeListNode temp = first;
        boolean found = false;
        while (temp != null && !found)
        {
            if (temp.getData().equals(d))
                found = true;
            temp = temp.getNext(); // move along to next node in the list
        }
        return found;
    }

    /**
     * Returns a string containing every node in List.
     */
    @Override
    public String toString()
    {
        EmployeeListNode temp = first;
        String value = "";
        while (temp != null)
        {
            value = value + " " + temp.toString() + "\n";
            temp = temp.getNext();
        }
        return value;
    }
}
