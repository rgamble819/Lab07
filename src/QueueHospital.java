import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType>
{

    private Queue<PatientType> patientList;
    
    public QueueHospital()
    {
        patientList = new LinkedList<PatientType>();
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
        return patientList.remove();
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
