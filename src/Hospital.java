import java.util.ArrayList;
class Hospital{

    protected ArrayList<Patient> patients;
    protected ArrayList<Nurse> nurses;
    private  ArrayList<String> nursesIDs;
    private  ArrayList<String> nursesPasscodes;
    private ArrayList<String>patientsIds;
    private ArrayList<String>receptionistsIDs;
    private ArrayList<String>receptionistsPassCodes;


    public Hospital(){
      this.patients=new ArrayList<>();
      this.nurses=new ArrayList<>();
      this.nursesIDs=new ArrayList<>();
      this.nursesPasscodes=new ArrayList<>();
      this.patientsIds=new ArrayList<>();
      this.receptionistsIDs=new ArrayList<>();
      this.receptionistsPassCodes=new ArrayList<>();
    }

    public  boolean verifyNurse(String nurseIDD,String passsCode) {
            return (nursesIDs.contains(nurseIDD) && nursesPasscodes.contains(passsCode));
        }


    public void addPatientsIds(String id){
        patientsIds.add(id);
    }
    public void addNursesIds(String id){
        nursesIDs.add(id);
    }
    public void addNursesPasscodes(String passCode){
        nursesPasscodes.add(passCode);
    }
    public boolean verifyPatients(String id3){
         return (patientsIds.contains(id3));

    }
    public boolean verifyReceptionist(String iid,String passCodee){

        return(receptionistsIDs.contains(iid) && receptionistsPassCodes.contains(passCodee));
    }
    public void addReceptionistIDS(String iD) {

            receptionistsIDs.add(iD);


    }

    public void addReceptionistPassCodes(String passCode){
        if (!receptionistsPassCodes.contains(passCode)){
            receptionistsPassCodes.add(passCode);
        }


    }


    public void addNurse(Nurse newNur) {
        if (!nurses.contains(newNur)) {
            nurses.add(newNur);
        } else if (nurses.contains(newNur)) {
            System.out.println("this nurse is already exist");
        }
    }
    public void addPatient(Patient newPatient) {
        if (!patients.contains(newPatient)) {
            patients.add(newPatient);
        }
        else if (patients.contains(newPatient)){
            System.out.println("this patient is already exist");
        }
    }

    public void getNurses() {
        for (int i=0;i<nurses.size();i++){
            System.out.println(nurses.get(i));
        }

    }
    public void getPatients(){
        for (int i = 0; i <patients.size() ; i++) {
            System.out.println(patients.get(i));

        }
    }
}