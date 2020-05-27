package examsystem;

public class obj {
    private int noq,time;
    private String name,pwd;
    public obj(String name,String pwd,int noq,int time)
    {
        this.name=name;
        this.pwd=pwd;
        this.noq=noq;
        this.time=time;
        
    }
    public String getname()
    {
        return name;
    }
    public String getpwd()
    {
        return pwd;
    }
    public int getnoq()
    {
        return noq;
    }
    public int gettime()
    {
        return time;
    }
   
    
}
