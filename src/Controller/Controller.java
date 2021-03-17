package Controller;
import Model.Model;
import view.InputUtility;
import view.View;

public class Controller {
    private View view = new View();
    int n=30;
    private Model model = new Model(n);
    public void PrintAll()
    {
        view.printString(view.TableStart);

        for (int i = 0; i < n; i++) {
            view.printString(model.To_String(i));

        }
    }
    public void PrintwithRoute(int route)
    {
        view.printString(view.TableStart);

        for (int i = 0; i < n; i++) {
            if(model.AutobusPark[i].GetRoute()==route)
            view.printString(model.To_String(i));

        }
    }
    public void PrintwithYear(int time)
    {
        view.printString(view.TableStart);

        for (int i = 0; i < n; i++) {
            if(2021-model.AutobusPark[i].GetStartYear()>time)
                view.printString(model.To_String(i));

        }
    }
    public void PrintwithRun(int run)
    {
        view.printString(view.TableStart);

        for (int i = 0; i < n; i++) {
            if(model.AutobusPark[i].GetRun()>run)
                view.printString(model.To_String(i));

        }
    }
   public  void calculate() {
        int ex=0;
        while(ex!=1) {
            int x = InputUtility.InputInt(view);
            int y;
            switch (x) {
                case 0:
                    ex = 1;
                    break;
                case 1:
                    PrintAll();
                    break;
                case 2:
                     y = InputUtility.InputRoute(view);
                    PrintwithRoute(y);
                    break;
                case 3: y = InputUtility.InputTime(view);
                PrintwithYear(y);
                    break;
                case 4: y= InputUtility.InputRun(view);
                PrintwithRun(y);
                    break;
            }
        }


    }

}
