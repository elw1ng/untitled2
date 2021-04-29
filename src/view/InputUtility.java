package view;

import java.util.Scanner;

public class InputUtility {
    public static int inputInt(View view) {
        int x;
        Scanner scanner = new Scanner(System.in);
        view.printString(view.inputRequest);
            while (!scanner.hasNextInt()) {
                view.printString(view.notIntegerInput + view.inputRequest);
                scanner.next();
            }
            x = scanner.nextInt();


        return x;
    }

    public static int inputRoute(View view) {
        Scanner scanner = new Scanner(System.in);
        view.printString(view.inputRoute);
        while (!scanner.hasNextInt()) {
            view.printString(view.notIntegerInput + view.inputRoute);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static int inputTime(View view) {
        Scanner scanner = new Scanner(System.in);
        view.printString(view.inputTime);
        while (!scanner.hasNextInt()) {
            view.printString(view.notIntegerInput + view.inputTime);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static int inputRun(View view) {
        Scanner scanner = new Scanner(System.in);
        view.printString(view.inputRun);
        while (!scanner.hasNextInt()) {
            view.printString(view.notIntegerInput + view.inputRun);
            scanner.next();

        }
        int X = scanner.nextInt();
        return X;
    }
}