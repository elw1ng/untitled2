package controller;
import view.View;
import view.InputUtility;

import model.Sorter;

public class Controller {
    private View view = new View();
    private Sorter sorter = new Sorter();



    public void calculate() {
        while (true) {
            int x;
            while (true) {
                try {
                    x = InputUtility.inputInt(view);
                    Validator.checkForInputRange(x);
                    break;
                }
                catch (InputRangeException e) {
                    view.printString(view.wrongInput);
                }
            }
            switch (x) {
                case 0:
                    System.exit(1);
                    break;
                case 1:
                    view.printAll(sorter.getAll());
                    break;
                case 2:
                    try {
                        int checkRoute = InputUtility.inputRoute(view);
                        Validator.checkForRouteRange(checkRoute);
                        view.printAll(sorter.getwithRoute(checkRoute));
                    }
                    catch (RouteRangeException e) {
                        view.printString(view.wrongInput);
                    }
                    break;
                case 3:
                    try {
                        int checkYear = InputUtility.inputTime(view);
                        Validator.checkForYearRange(checkYear);
                        view.printAll(sorter.getwithYear(checkYear));
                    }
                    catch (YearRangeException e) {
                        view.printString(view.wrongInput);
                    }
                    break;
                case 4:
                    try {
                        int checkRun = InputUtility.inputRun(view);
                        Validator.checkForRunRange(checkRun);
                        view.printAll(sorter.getwithRun(checkRun));
                    }
                    catch (RunRangeException e) {
                        view.printString(view.wrongInput);
                    }
                    break;
            }
        }


    }

}
