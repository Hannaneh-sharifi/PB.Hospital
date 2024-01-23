 class NurseLoginTime extends LoginTime{


    private String time;
    private String id;
    public NurseLoginTime(String id,String time){
        super(id,time);
    }
    @Override
     public void logTime(){
        System.out.println("login time of nurses:/n"+id+"/t"+time);
    }

}