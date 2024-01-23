class Doctor{
    private String name;
    private String id;
    private String passCode;
    public Doctor(String name,String id,String passCode){
        this.name=name;
        this.passCode=passCode;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassCode() {
        return passCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}