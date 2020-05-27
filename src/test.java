package examsystem;
public class test {
    private String testname;
    private int noq,time;
    public test(String testname,int noq,int time)
    {
        this.testname=testname;
        this.noq=noq;
        this.time=time;
    }
    public String getname()
    {
        return testname;}
    public int getnoq()
    {
        return noq;
    }
    public int gettime()
    {
        return time;
    }
}
