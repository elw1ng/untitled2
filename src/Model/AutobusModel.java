package Model;

public class AutobusModel {
    private String DriverFirstName;
    private String DriverSecondName;
    private int BusNum;
    private int RouteNum;
    private String Brand;
    private int StartYear;
    private int run;
    public String GetFirstName()
    {
        return this.DriverFirstName;
    }
    public String GetSecondName()
    {
        return this.DriverSecondName;
    }
    public int GetNum()
    {
        return this.BusNum;
    }
    public int GetRoute()
    {
        return this.RouteNum;
    }
    public String GetBrand()
    {
        return this.Brand;
    }
    public int GetStartYear () {return this.StartYear;}
    public int GetRun () {return this.run;}

    public AutobusModel(String DriverFirstName,String DriverSecondName,int BusNum,int RouteNum,String Brand,int StartYear,int run)
    {
        this.DriverFirstName=DriverFirstName;
        this.DriverSecondName=DriverSecondName;
        this.BusNum=BusNum;
        this.RouteNum=RouteNum;
        this.Brand=Brand;
        this.StartYear=StartYear;
        this.run=run;
    }
    public AutobusModel()
    {

    }
    public void SetFirstName(String input)
    {
        this.DriverFirstName=input;
    }
    public void SetSecondName(String input)
    {
        this.DriverSecondName=input;
    }
    public void SetNum(int input)
    {
        this.BusNum=input;
    }
    public void SetRoute(int input)
    {
         this.RouteNum=input;
    }
    public void SetBrand(String input)
    {
         this.Brand=input;
    }
    public void SetStartYear (int input) { this.StartYear=input;}
    public void SetRun (int input) { this.run=input;}


}
