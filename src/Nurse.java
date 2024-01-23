
class Nurse{
    private String firstName;

    private String lastName;

    private  String nurseID;
    private static String passCode;


    public Nurse(String firstName,String lastName,String nurseID,String passCode){
        this.firstName=firstName;
        this.lastName=lastName;
        this.nurseID=nurseID;
        Nurse.passCode =passCode;

    }




    public void changePassword(String pass){
        passCode=pass;
        System.out.println("passCode changed successfully!");

    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNurseID() {
        return nurseID;
    }

    public void setNurseID(String nurseID) {
        this.nurseID = nurseID;
    }

    public String getPassCode(){
        return passCode;
    }



}