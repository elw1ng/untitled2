package Model;

public class Model {
   int n=100;
    public AutobusModel[] AutobusPark = new AutobusModel[n];
    public String To_String( int i)
    {
        String ret = AutobusPark[i].GetFirstName(); ret+='\t';
        ret+=AutobusPark[i].GetSecondName(); ret+='\t';
        ret+=AutobusPark[i].GetBrand(); ret+='\t';
        ret+=String.valueOf(AutobusPark[i].GetNum()); ret+='\t';
        ret+=String.valueOf(AutobusPark[i].GetRoute()); ret+="\t\t";
        ret+=String.valueOf(AutobusPark[i].GetRun()); ret+='\t';
        ret+=String.valueOf(AutobusPark[i].GetStartYear());
        return ret;
    }
    public Model(int n)
    {
        this.n=n;
        Randomiser rand = new Randomiser();
        for(int i=0;i<n;i++) {
            AutobusPark[i]=new AutobusModel(rand.RandomFirstName(),rand.RandomSecondName(), i,rand.Randomroute(),rand.RandomBrand(),rand.RandomYear(),rand.RandomRun());
        }
    }

}
