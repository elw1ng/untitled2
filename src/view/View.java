package view;

import Model.Autobus;

public class View {

    public static String tableStart = "FirstName\tSecondName\tBrand\tBusNum\tRoute\tRun\t\tStartYear\n";
    public static String inputRequest = "Please, write number \n(0= Exit, \n1= Show all information, \n2 = Information with specific route, \n3= Information with Time of work more than X, \n4 = Information with Run more than X )\n";
    public static String wrongInput = "Input is wrong\n";
    public static String notIntegerInput = "Input is not integer\n";
    public static String inputRoute = "Write route, please: \n";
    public static String inputTime = "Write time, please: \n";
    public static String inputRun = "Write run, please: \n";
    public static String emptyTable =  "Table is empty\n";

    public static void printString(String str) {
        System.out.println(str);
    }

    public static void printAll(Autobus[] park) {
        if (park.length!=0) {
            printString(tableStart);
            for (int i = 0; i < park.length; i++) {
                printString(park[i].toString());
            }
        }else {
            printString(emptyTable);
        }

    }


}
