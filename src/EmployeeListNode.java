/**
 * One object of class stores a node that holds the pointers to data and the
 * next node.
 */
class EmployeeListNode
{
    private Object data; // Holds whatever data is in each node
    private EmployeeListNode next; // Holds the reference to the next node
                                   // in the List

    // returns the data pointer
    Object getData()
    {
        return data;
    }

    // setter for data pointer
    void setData(Object newData)
    {
        data = newData;
    }

    // returns pointer for next node
    EmployeeListNode getNext()
    {
        return next;
    }

    // sets the next node pointer
    void setNext(EmployeeListNode newNext)
    {
        next = newNext;
    }

    /**
     * Constructs a new EmployeeListNode object that refers to "d". "d" can be
     * any class of Object
     */
    public EmployeeListNode(Object d)
    {
        data = d;
        next = null;
    }

    /**
     * Constructs a new EmployeeListNode object that refers to "d" as its data
     * and refers to "n" as its next one in the List.
     */
    public EmployeeListNode(Object d, EmployeeListNode n)
    {
        data = d;
        next = n;
    }

    /**
     * returns the data in this EmployeeListNode, in String format
     */
    @Override
    public String toString()
    {
        return data.toString();
    }
}
