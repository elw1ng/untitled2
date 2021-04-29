package controller;

public class Validator {

    public static void checkForInputRange(int x) throws InputRangeException {
        if ( x>4 || x <0 )
            throw new InputRangeException("Input "+x+ " is less then  0 or more than 4");
    }
    public static void checkForRouteRange(int route) throws RouteRangeException {
        if ( route>1000||route<0)
            throw new RouteRangeException("Input "+route+ " is less then  0 or more than 1000");
    }
    public static void checkForYearRange(int year) throws YearRangeException {
        if ( year>400||year<0)
            throw new YearRangeException("Input "+year+ " is less then  0 or more than 400");
    }
    public static void checkForRunRange(int run) throws RunRangeException {
        if ( run<0)
            throw new RunRangeException("Input "+run+ " is less then  0");
    }
}
