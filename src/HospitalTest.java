import org.junit.Assert;
import org.junit.Test;

public class HospitalTest
{
    @Test
    public void StackHospitalTest() 
    {
        // Animal StackHospital Constructor
        StackHospital<Animal> AnimalStackHos = new StackHospital<Animal>();
        
        //Create elements to add to Hospital
        Animal ani1 = new Animal("Tiger", 4);
        Animal ani2 = new Animal("Turtle", 99);
        Animal ani3 = new Animal("Alligator", 7);
        
        // Testing addPatient method
        AnimalStackHos.addPatient(ani1);
        AnimalStackHos.addPatient(ani2);
        AnimalStackHos.addPatient(ani3);
        
        //Testing numPatients
        Assert.assertEquals("Unexpected number of patients in StackHospital", 3, AnimalStackHos.numPatients());
        
        //Testing all Patients Info
        Assert.assertEquals("Patient information is incorrect in StackHospital", ani1.toString() + ani2.toString() + ani3.toString(), AnimalStackHos.allPatientInfo());
        
        // Testing next Patient
        Assert.assertEquals("Unexpected order of StackHospital patientList", ani3, AnimalStackHos.nextPatient());
        
        // Testing treatNextPatient
        Assert.assertEquals("Unexpected order of StackHospital patientList", ani3, AnimalStackHos.treatNextPatient());
        Assert.assertEquals("Unexpected order of StackHospital patientList", ani2, AnimalStackHos.treatNextPatient());
        Assert.assertEquals("Unexpected order of StackHospital patientList", ani1, AnimalStackHos.treatNextPatient());
        
        // Testing hospitalType
        Assert.assertEquals("Incorrect HospitalType", "StackHospital", AnimalStackHos.hospitalType());  
        
        // Testing Hospital toString
        Assert.assertEquals("Incorrect Hospital toString", "A StackHospital-type hospital with 0 patients.", AnimalStackHos.toString());
    }
    
    @Test
    public void PriorityQueueHospitalTest() 
    {
        // Animal PriorityQueueHospital Constructor
        PriorityQueueHospital<Person> PersonPriorityQueueHos = new PriorityQueueHospital<Person>();
        
        //Create elements to add to Hospital
        SickPerson person1 = new SickPerson("Joe", 3, 5);
        SickPerson person2 = new SickPerson("Jimmy", 8, 1);
        SickPerson person3 = new SickPerson("George", 80, 4);
        
        // Testing addPatient method
        PersonPriorityQueueHos.addPatient(person1);
        PersonPriorityQueueHos.addPatient(person2);
        PersonPriorityQueueHos.addPatient(person3);
        
        //Testing numPatients
        Assert.assertEquals("Unexpected number of patients in PriorityQueueHospital", 3, PersonPriorityQueueHos.numPatients());
        
        //Testing all Patients Info
        Assert.assertEquals("Patient information is incorrect in PriorityQueueHospital", person1.toString() + person2.toString() + person3.toString(), PersonPriorityQueueHos.allPatientInfo());
        
        // Testing next Patient
        Assert.assertEquals("Unexpected order of PriorityQueueHospital patientList", person1, PersonPriorityQueueHos.nextPatient());
        
        // Testing treatNextPatient
        Assert.assertEquals("Unexpected order of PriorityQueueHospital patientList", person1, PersonPriorityQueueHos.treatNextPatient());
        Assert.assertEquals("Unexpected order of PriorityQueueHospital patientList", person3, PersonPriorityQueueHos.treatNextPatient());
        Assert.assertEquals("Unexpected order of PriorityQueueHospital patientList", person2, PersonPriorityQueueHos.treatNextPatient());
        
        // Testing hospitalType
        Assert.assertEquals("Incorrect HospitalType", "PriorityQueueHospital", PersonPriorityQueueHos.hospitalType());   
        
        // Testing with type of Person
        SickPerson patient1 = new SickPerson("Hans", 55, 3);
        SickPerson patient3 = new SickPerson("Mike", 40, 4);
        HealthyPerson patient2 = new HealthyPerson("Luke", 45, "CheckUp");
        
        PersonPriorityQueueHos.addPatient(patient3);
        PersonPriorityQueueHos.addPatient(patient2);
        PersonPriorityQueueHos.addPatient(patient1);
        
        Assert.assertEquals("Unexpected order of PriorityQueueHospital patientList", patient3, PersonPriorityQueueHos.treatNextPatient());
        Assert.assertEquals("Unexpected order of PriorityQueueHospital patientList", patient1, PersonPriorityQueueHos.treatNextPatient());
       // Assert.assertEquals("Unexpected order of PriorityQueueHospital patientList", patient2, PersonPriorityQueueHos.treatNextPatient());
        
    }
    
    @Test
    public void QueueHospitalTest() 
    {
        // Animal QueueHospital Constructor
        QueueHospital<Animal> AnimalQueueHos = new QueueHospital<Animal>();
        
        //Create elements to add to Hospital
        Animal ani1 = new Animal("Tiger", 4);
        Animal ani2 = new Animal("Turtle", 99);
        Animal ani3 = new Animal("Alligator", 7);
        
        // Testing addPatient method
        AnimalQueueHos.addPatient(ani1);
        AnimalQueueHos.addPatient(ani2);
        AnimalQueueHos.addPatient(ani3);
        
        //Testing numPatients
        Assert.assertEquals("Unexpected number of patients in QueueHospital", 3, AnimalQueueHos.numPatients());
        
        //Testing all Patients Info
        Assert.assertEquals("Patient information is incorrect in QueueHospital", ani1.toString() + ani2.toString() + ani3.toString(), AnimalQueueHos.allPatientInfo());
        
        // Testing next Patient
        Assert.assertEquals("Unexpected order of QueueHospital patientList", ani1, AnimalQueueHos.nextPatient());
        
        // Testing treatNextPatient
        Assert.assertEquals("Unexpected order of QueueHospital patientList", ani1, AnimalQueueHos.treatNextPatient());
        Assert.assertEquals("Unexpected order of QueueHospital patientList", ani2, AnimalQueueHos.treatNextPatient());
        Assert.assertEquals("Unexpected order of QueueHospital patientList", ani3, AnimalQueueHos.treatNextPatient());
        
        // Testing hospitalType
        Assert.assertEquals("Incorrect HospitalType", "QueueHospital", AnimalQueueHos.hospitalType());   
    }
}
