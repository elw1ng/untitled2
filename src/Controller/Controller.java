package Controller;
import Controller.Validator;
import Controller.InputRangeException;
import Model.Storage;
import view.View;
import view.InputUtility;

import Model.Sorter;

public class Controller {
    private View view = new View();
    private Sorter sorter = new Sorter();



    public void calculate() {
        while (true) {
            int x;
            while (true) {
                try {
                    x = InputUtility.inputInt(view);
                    Validator.checkForInputRange(x,view);
                    break;
                }
                catch (InputRangeException e)
                {
                    System.err.println(e.getMessage());
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
                    view.printAll(sorter.getwithRoute(InputUtility.inputRoute(view)));
                    break;
                case 3:
                    view.printAll(sorter.getwithYear(InputUtility.inputTime(view)));
                    break;
                case 4:
                    view.printAll(sorter.getwithRun(InputUtility.inputRun(view)));
                    break;
            }
        }


    }

}
