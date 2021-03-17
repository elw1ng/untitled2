package view;
import java.util.Scanner;
import view.View;
public class InputUtility {
    public static int InputInt(View view)
    {
        int X;
        Scanner scanner = new Scanner(System.in);
        view.printString(view.InputRequest);
        do {


            while (!scanner.hasNextInt()) {
                view.printString(view.WrongInput + view.InputRequest);
                scanner.next();

            }

             X = scanner.nextInt();
            if (X < 0 || X > 4) {
                view.printString(view.WrongInput + view.InputRequest);
            }
        } while (X < 0 || X > 4);
        return X;

    }
    public static int InputRoute(View view)
    {

        Scanner scanner = new Scanner(System.in);
        view.printString(view.InputRoute);



            while (!scanner.hasNextInt()) {
                view.printString(view.WrongInput + view.InputRoute);
                scanner.next();

            }

           int X = scanner.nextInt();

        return X;

    }
    public static int InputTime(View view)
    {

        Scanner scanner = new Scanner(System.in);
        view.printString(view.InputTime);



        while (!scanner.hasNextInt()) {
            view.printString(view.WrongInput + view.InputTime);
            scanner.next();

        }

        int X = scanner.nextInt();

        return X;

    }
    public static int InputRun(View view)
    {

        Scanner scanner = new Scanner(System.in);
        view.printString(view.InputRun);



        while (!scanner.hasNextInt()) {
            view.printString(view.WrongInput + view.InputRun);
            scanner.next();

        }

        int X = scanner.nextInt();

        return X;

    }
}
