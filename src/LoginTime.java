class LoginTime{
    private String id;
    private String time;
    public LoginTime(String id,String time){
        this.id=id;
        this.time=time;
    }
    public void logTime(){
        System.out.println("login time of personnel:/n"+id+"/t"+time);

    }
}