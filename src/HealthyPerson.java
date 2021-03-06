
public class HealthyPerson extends Person
{

    private String reason;
    public HealthyPerson(String name, int age, String reason) 
    {
        super(name, age);
        this.reason = reason;
    }
    
    @Override
    protected int compareToImpl(Person p)
    {
        if(p instanceof HealthyPerson) {
            String healthyNameToCompare = ((HealthyPerson)p).getName(); 
            return this.getName().compareToIgnoreCase(healthyNameToCompare);
        }
        else 
        {
            return 0;
        }
    }
    
    public String toString() 
    {
        return String.format("%s In for %s", super.toString(), this.reason);
    }
}
