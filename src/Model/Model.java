package Model;

public class Model {
    int n = 10;
    public Autobus[] AutobusPark = new Autobus[n];

    public Model() {
        Randomiser rand = new Randomiser();
        for (int i = 0; i < n; i++) {
            AutobusPark[i] = new Autobus(rand.RandomFirstName(), rand.RandomSecondName(), i, rand.Randomroute(), rand.RandomBrand(), rand.RandomYear(), rand.RandomRun());
        }
    }

    public Autobus[] getCopy() {
        return AutobusPark;
    }

    public int getSize() {
        return n;
    }

}
