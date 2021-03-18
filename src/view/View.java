package view;

import Model.Autobus;

public class View {

    public static String TableStart = "FirstName\tSecondName\tBrand\tBusNum\tRoute\tRun\t\tStartYear\n";
    public static String InputRequest = "Please, write number \n(0= Exit, \n1= Show all information, \n2 = Information with specific route, \n3= Information with Time of work more than X, \n4 = Information with Run more than X )\n";
    public static String WrongInput = "Input is wrong\n";
    public static String InputRoute = "Write route, please: \n";
    public static String InputTime = "Write time, please: \n";
    public static String InputRun = "Write run, please: \n";

    public static void printString(String str) {
        System.out.println(str);
    }

    public static void PrintAll(Autobus[] park, int n) {
        for (int i = 0; i < n; i++) {
            printString(park[i].toString());
        }

    }

    public static void PrintwithRoute(Autobus[] park, int n, int route) {
        for (int i = 0; i < n; i++) {
            if (park[i].getRoute() == route)
                printString(park[i].toString());

        }
    }

    public static void PrintwithYear(Autobus[] park, int n, int time) {
        for (int i = 0; i < n; i++) {
            if (2021 - park[i].getStartYear() > time)
                printString(park[i].toString());

        }
    }

    public static void PrintwithRun(Autobus[] park, int n, int run) {
        for (int i = 0; i < n; i++) {
            if (park[i].getRun() > run)
                printString(park[i].toString());

        }
    }

}
