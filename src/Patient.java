import java.util.ArrayList;
import java.lang.*;
class Patient {
    private String patientFirstName;
    private String patientLastName;
    private String patientId;
    private String doctorName;
    private int birth;
    private String patientGender;
    private String dateOfHospitalization;
    private String drug;
    private ArrayList<String> drugs;



    public Patient(String patientFirstName,String patientLastName,String doctorName,String drugs ,String dateOfHospitalization,int birth,String patientGender,String patientId) {
        this.patientFirstName=patientFirstName;
        this.patientLastName=patientLastName;
        this.birth = birth;
        this.doctorName=doctorName;
        this.patientGender=patientGender;
        this.patientId=patientId;
        this.drug=drug;
        this.dateOfHospitalization=dateOfHospitalization;
        this.drugs=new ArrayList<String>();

    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDateOfHospitalization() {
        return dateOfHospitalization;
    }

    public void setDateOfHospitalization(String dateOfHospitalization) {
        this.dateOfHospitalization = dateOfHospitalization;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }
    public void addDrugs(String drug){
        drugs.add(drug);
    }
    public void removeDrugs(String drug){
        drugs.remove(drug);
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName=doctorName;
    }

    public String getPatientGender() {
        return patientGender;
    }








    public String toString() {
        return "Patient : name='" + patientFirstName +patientLastName+" , ID:"+patientId+ "date of hospitalization:"+dateOfHospitalization+ ", birth=" + birth +", doctor = "+doctorName+" , gender:"+patientGender+"drug:"+drug+".";
    }
}

