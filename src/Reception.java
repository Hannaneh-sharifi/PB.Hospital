import java.util.ArrayList;
class Reception {
    private String sectionName;

    private ArrayList<Patient> patients;

    public Reception(String sectionName) {
        this.sectionName= sectionName;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    public String getsectionName() {
        return sectionName;
    }
}