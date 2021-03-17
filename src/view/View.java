package view;

public class View {

    public static String TableStart= "FirstName\tSecondName\tBrand\tBusNum\tRoute\tRun\t\tStartYear\n";
    public static String InputRequest = "Please, write number \n(0= Exit, \n1= Show all information, \n2 = Information with specific route, \n3= Information with Time of work more than X, \n4 = Information with Run more than X )\n";
    public static String WrongInput = "Input is wrong\n";
    public static String InputRoute = "Write route, please: \n";
    public static String InputTime = "Write time, please: \n";
    public static String InputRun = "Write run, please: \n";
    public void printString(String str)
    {
        System.out.println(str);
    }



}
