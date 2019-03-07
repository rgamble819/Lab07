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
        Assert.assertEquals("Incorrect HospitalType", "StackHospital<PatientType>", AnimalStackHos.hospitalType());   
    }
    
    @Test
    public void PriorityQueueHospitalTest() 
    {
        // Animal PriorityQueueHospital Constructor
        PriorityQueueHospital<Animal> AnimalStackHos = new PriorityQueueHospital<Animal>();
        
        //Create elements to add to Hospital
        Animal ani1 = new Animal("Tiger", 4);
        Animal ani2 = new Animal("Turtle", 99);
        Animal ani3 = new Animal("Alligator", 7);
        
        // Testing addPatient method
        AnimalStackHos.addPatient(ani1);
        AnimalStackHos.addPatient(ani2);
        AnimalStackHos.addPatient(ani3);
        
        //Testing numPatients
        Assert.assertEquals("Unexpected number of patients in PriorityQueueHospital", 3, AnimalStackHos.numPatients());
        
        //Testing all Patients Info
        Assert.assertEquals("Patient information is incorrect in PriorityQueueHospital", ani2.toString() + ani1.toString() + ani3.toString(), AnimalStackHos.allPatientInfo());
        
        // Testing next Patient
        Assert.assertEquals("Unexpected order of PriorityQueueHospital patientList", ani2, AnimalStackHos.nextPatient());
        
        // Testing treatNextPatient
        Assert.assertEquals("Unexpected order of PriorityQueueHospital patientList", ani2, AnimalStackHos.treatNextPatient());
        Assert.assertEquals("Unexpected order of PriorityQueueHospital patientList", ani3, AnimalStackHos.treatNextPatient());
        Assert.assertEquals("Unexpected order of PriorityQueueHospital patientList", ani1, AnimalStackHos.treatNextPatient());
        
        // Testing hospitalType
        Assert.assertEquals("Incorrect HospitalType", "PriorityQueueHospital<PatientType>", AnimalStackHos.hospitalType());   
    }
    
    @Test
    public void QueueHospitalTest() 
    {
        // Animal QueueHospital Constructor
        QueueHospital<Animal> AnimalStackHos = new QueueHospital<Animal>();
        
        //Create elements to add to Hospital
        Animal ani1 = new Animal("Tiger", 4);
        Animal ani2 = new Animal("Turtle", 99);
        Animal ani3 = new Animal("Alligator", 7);
        
        // Testing addPatient method
        AnimalStackHos.addPatient(ani1);
        AnimalStackHos.addPatient(ani2);
        AnimalStackHos.addPatient(ani3);
        
        //Testing numPatients
        Assert.assertEquals("Unexpected number of patients in QueueHospital", 3, AnimalStackHos.numPatients());
        
        //Testing all Patients Info
        Assert.assertEquals("Patient information is incorrect in QueueHospital", ani1.toString() + ani2.toString() + ani3.toString(), AnimalStackHos.allPatientInfo());
        
        // Testing next Patient
        Assert.assertEquals("Unexpected order of QueueHospital patientList", ani1, AnimalStackHos.nextPatient());
        
        // Testing treatNextPatient
        Assert.assertEquals("Unexpected order of QueueHospital patientList", ani1, AnimalStackHos.treatNextPatient());
        Assert.assertEquals("Unexpected order of QueueHospital patientList", ani2, AnimalStackHos.treatNextPatient());
        Assert.assertEquals("Unexpected order of QueueHospital patientList", ani3, AnimalStackHos.treatNextPatient());
        
        // Testing hospitalType
        Assert.assertEquals("Incorrect HospitalType", "QueueHospital<PatientType>", AnimalStackHos.hospitalType());   
    }
}
