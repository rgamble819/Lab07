import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType>
{
    private Stack<PatientType> patientList;
    
    public StackHospital()
    {
        patientList = new Stack<PatientType>();
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
        return patientList.pop();
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
