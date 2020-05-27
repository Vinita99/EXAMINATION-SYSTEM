
package examsystem;

public class status {
    private String uname,tname,date_time;
    private int marks;
    public status(String uname,String tname,int marks,String date_time )
    {
        this.tname=tname;
        this.uname=uname;
        this.marks=marks;
        this.date_time=date_time;
    }
    public String gettname()
    {
        return tname;
    }
    public String getuname()
    {
        return uname;
    }
    public String getdt()
    {
        return date_time;
    }
    public int getmarks()
    {
        return marks;
    }
    

}
