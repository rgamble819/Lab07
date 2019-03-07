
public class SickPerson extends Person
{
    
    private int severity;
    public SickPerson(String name, int age, int severity)
    {
        super(name, age);
        this.severity = severity;
    }

    @Override
    protected int compareToImpl(Person p)
    {
        int serverityToCompare = ((SickPerson)p).severity;
        
        if(this.severity > serverityToCompare) 
        {
            return 1;
        }
        else if(this.severity < serverityToCompare) 
        {
            return -1;
        }
        else 
        {
            return 0;
        }
    }
    
    public String toString() 
    {
        return String.format("%s Severity level %d", this.getName(), this.severity);
    }

}
