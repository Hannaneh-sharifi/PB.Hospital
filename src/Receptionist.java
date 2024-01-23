
class Receptionist{
    private String ID;
    private String passCode;
    private String fName;
    private String lName;

    public Receptionist(String ID,String passCode,String fName,String lName){
        this.ID=ID;
        this.passCode=passCode;
        this.fName=fName;
        this.lName=lName;

    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }

    public String getPassCode() {
        return passCode;
    }

    public String getfName() {
        return fName;
    }

    public String getID() {
        return ID;
    }

    public String getlName() {
        return lName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

}