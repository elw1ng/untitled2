package Controller;

import Model.Model;
import view.InputUtility;
import view.View;

public class Controller {
    private View view = new View();
    private Model model = new Model();

    public void printAll() {
        view.printString(view.TableStart);
        view.PrintAll(model.getCopy(), model.getSize());


    }

    public void printwithRoute(int route) {
        view.printString(view.TableStart);
        view.PrintwithRoute(model.getCopy(), model.getSize(), route);

    }

    public void printwithYear(int time) {
        view.printString(view.TableStart);
        view.PrintwithYear(model.getCopy(), model.getSize(), time);

    }

    public void printwithRun(int run) {
        view.printString(view.TableStart);
        view.PrintwithRun(model.getCopy(), model.getSize(), run);


    }

    public void calculate() {
        boolean ex = false;
        while (!ex) {
            int x = InputUtility.inputInt(view);
            int y;
            switch (x) {
                case 0:
                    ex = true;
                    break;
                case 1:
                    printAll();
                    break;
                case 2:
                    y = InputUtility.inputRoute(view);
                    printwithRoute(y);
                    break;
                case 3:
                    y = InputUtility.inputTime(view);
                    printwithYear(y);
                    break;
                case 4:
                    y = InputUtility.inputRun(view);
                    printwithRun(y);
                    break;
            }
        }


    }

}
