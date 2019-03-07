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
    
    public void SickPersonTest() 
    {
        // Test the Constructor & Getters
        SickPerson sickPatient= new SickPerson("Billy", 14, 5);
        
        Assert.assertEquals("Unexpected or incorrect SickPerson name", "Billy", sickPatient.getName());
        Assert.assertEquals("Unexpected or incorrect SickPerson age", 4, sickPatient.getAge());       
        
        
    }
}
