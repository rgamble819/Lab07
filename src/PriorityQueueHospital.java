import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType>
{

    private PriorityQueue<PatientType> patientList;
    
    public PriorityQueueHospital()
    {
        patientList = new PriorityQueue<PatientType>();
    }

    @Override
    public void addPatient(PatientType patient)
    {
        patientList.add(patient);
    }

    @Override
    public PatientType nextPatient()
    {
        return patientList.peek();
    }

    @Override
    public PatientType treatNextPatient()
    {
        PatientType p = this.nextPatient();
        patientList.remove(p);
        return p;
    }

    @Override
    public int numPatients()
    {
        return patientList.size();
    }

    @Override
    public String hospitalType()
    {
        return this.getClass().getName();
    }

    @Override
    public String allPatientInfo()
    {
        String result = "";
        for(PatientType patient : patientList) 
        {
            result += patient.toString();
        }
        
        return result;
    }
}
