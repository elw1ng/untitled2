package Controller;

import Model.Storage;
import view.InputUtility;
import view.View;
import Model.Sorter;

public class Controller {
    private View view = new View();
    private Sorter sorter = new Sorter();



    public void calculate() {
        while (true) {
            int x = InputUtility.inputInt(view);
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
                default:
                    view.printString(View.wrongInput);
            }
        }


    }

}
