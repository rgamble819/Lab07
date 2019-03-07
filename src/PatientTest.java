import org.junit.Assert;
import org.junit.Test;

public class PatientTest
{
    @Test
    public void AnimalTest() 
    {
        // Test the Constructor & Getters
        Animal aniPatient = new Animal("Tiger", 4);
        
        Assert.assertEquals("Unexpected or incorrect Animal breed type", "Tiger", aniPatient.getBreed());
        Assert.assertEquals("Unexpected or incorrect Animal age", 4, aniPatient.getAge());       
        
        // Testing toString
        Assert.assertEquals("Unexpected or incorrect Animal toString", "A 4-year old Tiger.", aniPatient.toString());
   
        // CompareTo Test
        Animal compare1 = new Animal("Turtle", 99);
        Animal compare2 = new Animal("Lion", 6);
        
        Assert.assertEquals("Animal compareTo was incorrect", 93, compare2.compareTo(compare1));
        Assert.assertEquals("Animal compareTo was incorrect", -93, compare1.compareTo(compare2));
        
        // CompareTo case 2
        Animal compare3 = new Animal("Bearded Dragon", 6);
        Assert.assertEquals("Animal compareTo was incorrect", 0, compare2.compareTo(compare3));
    }
    
    @Test
    public void SickPersonTest() 
    {
        // Test the Constructor & Getters
        SickPerson sickPatient = new SickPerson("Billy", 14, 5);
        
        Assert.assertEquals("Unexpected or incorrect SickPerson name", "Billy", sickPatient.getName());
        Assert.assertEquals("Unexpected or incorrect SickPerson age", 14, sickPatient.getAge()); 
        
        // ToString Test
        Assert.assertEquals("Unexpected or incorrect SickPerson toString", "Billy Severity level 5", sickPatient.toString()); 
        
        // Testing compareTo
        SickPerson compare1 = new SickPerson("Andrew", 14, 2);
        SickPerson compare2 = new SickPerson("Jack", 16, 1);
        SickPerson compare3 = new SickPerson("Jack", 16, 1);
        
        //Case one
        Assert.assertEquals("Unexpected or incorrect compareTo", 1, compare1.compareTo(compare2)); 
        Assert.assertEquals("Unexpected or incorrect compareTo", -1, compare2.compareTo(compare1)); 
        Assert.assertEquals("Unexpected or incorrect compareTo", 0, compare2.compareTo(compare3)); 
        
        // Case two
        Person compare4 = new HealthyPerson("Rodger", 22, "Check-up");
        Assert.assertEquals("Unexpected or incorrect compareTo", 0, compare1.compareTo(compare4));
    }
    
    @Test
    public void HealthyPersonTest() 
    {
        // Test the Constructor & Getters
        HealthyPerson healthyPatient = new HealthyPerson("Drew", 8, "Check-Up");
        
        Assert.assertEquals("Unexpected or incorrect HealthyPerson name", "Drew", healthyPatient.getName());
        Assert.assertEquals("Unexpected or incorrect HealthyPerson age", 8, healthyPatient.getAge());
        
        // toStirng Test
        Assert.assertEquals("Unexpected or incorrect HealthyPerson toString", "Drew In for Check-Up", healthyPatient.toString());
        
        // testing CompareTo
        HealthyPerson compare1 = new HealthyPerson("Joe", 5, "check-up");
        HealthyPerson compare2 = new HealthyPerson("Andy", 10, "check-up");
        HealthyPerson compare3 = new HealthyPerson("Joe", 5, "check-up");
        
        Assert.assertEquals("Unexpected or incorrect compareTo", -9, compare2.compareTo(compare1)); 
        Assert.assertEquals("Unexpected or incorrect compareTo", 9, compare1.compareTo(compare2)); 
        Assert.assertEquals("Unexpected or incorrect compareTo", 0, compare1.compareTo(compare3)); 
        
        // Instance of Sick Person
        SickPerson compare4 = new SickPerson("Joey", 11, 1);
        Assert.assertEquals("Unexpected or incorrect compareTo", 0, compare1.compareTo(compare4));  
    }
}
