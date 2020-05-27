
package examsystem;
public class score {
    private String tname,lname,date_time;
    private int marks;
    public score(String tname,String lname,int marks,String date_time )
    {
        this.tname=tname;
        this.lname=lname;
        this.marks=marks;
        this.date_time=date_time;
    }
    public String gettname()
    {
        return tname;
    }
    public String getlname()
    {
        return lname;
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
