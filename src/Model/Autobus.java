package Model;

public class Autobus {
    private String driverFirstName;
    private String driverSecondName;
    private int busNum;
    private int routeNum;
    private String brand;
    private int startYear;
    private int run;

    public String getFirstName() {
        return this.driverFirstName;
    }

    public String getSecondName() {
        return this.driverSecondName;
    }

    public int getNum() {
        return this.busNum;
    }

    public int getRoute() {
        return this.routeNum;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getStartYear() {
        return this.startYear;
    }

    public int getRun() {
        return this.run;
    }

    public Autobus(String driverFirstName, String driverSecondName, int busNum, int routeNum, String brand, int startYear, int run) {
        this.driverFirstName = driverFirstName;
        this.driverSecondName = driverSecondName;
        this.busNum = busNum;
        this.routeNum = routeNum;
        this.brand = brand;
        this.startYear = startYear;
        this.run = run;
    }

    public Autobus() {

    }

    public void setFirstName(String input) {
        this.driverFirstName = input;
    }

    public void setSecondName(String input) {
        this.driverSecondName = input;
    }

    public void setNum(int input) {
        this.busNum = input;
    }

    public void setRoute(int input) {
        this.routeNum = input;
    }

    public void setBrand(String input) {
        this.brand = input;
    }

    public void setStartYear(int input) {
        this.startYear = input;
    }

    public void setRun(int input) {
        this.run = input;
    }

    @Override
    public String toString() {
        String ret = this.getFirstName();
        ret += '\t';
        ret += this.getSecondName();
        ret += '\t';
        ret += this.getBrand();
        ret += '\t';
        ret += String.valueOf(this.getNum());
        ret += '\t';
        ret += String.valueOf(this.getRoute());
        ret += "\t\t";
        ret += String.valueOf(this.getRun());
        ret += '\t';
        ret += String.valueOf(this.getStartYear());
        return ret;
    }

}
