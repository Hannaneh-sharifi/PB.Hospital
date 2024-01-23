class DoctorLoginTime extends LoginTime{
    private String id;
    private String time;
    public DoctorLoginTime(String id,String time){
        super(id,time);
    }
    @Override
    public void logTime(){
        System.out.println("login time of doctors:/n"+id+"/t"+time);
    }
}