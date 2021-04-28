package view;

import java.util.Scanner;
import Controller.Validator;
import Controller.NotIntegerInputException;
public class InputUtility {
    public static int inputInt(View view) {
        Scanner scanner = new Scanner(System.in);
        view.printString(view.inputRequest);
            while (true) {
                try {
                    Validator.checkForNotInt(scanner, view);
                    break;
                } catch (NotIntegerInputException e) {
                    System.err.println(e.getMessage());
                    scanner.next();
                }


            }
        return scanner.nextInt();
    }

    public static int inputRoute(View view) {
        Scanner scanner = new Scanner(System.in);
        view.printString(view.inputRoute);
        while (true) {
            try {
                Validator.checkForNotInt(scanner, view);
                break;
            } catch (NotIntegerInputException e) {
                System.err.println(e.getMessage());
                scanner.next();
            }


        }
        return scanner.nextInt();
    }

    public static int inputTime(View view) {
        Scanner scanner = new Scanner(System.in);
        view.printString(view.inputTime);
        while (true) {
            try {
                Validator.checkForNotInt(scanner, view);
                break;
            } catch (NotIntegerInputException e) {
                System.err.println(e.getMessage());
                scanner.next();
            }


        }
        return scanner.nextInt();
    }

    public static int inputRun(View view) {
        Scanner scanner = new Scanner(System.in);
        view.printString(view.inputRun);
        while (true) {
            try {
                Validator.checkForNotInt(scanner, view);
                break;
            } catch (NotIntegerInputException e) {
                System.err.println(e.getMessage());
                scanner.next();
            }


        }
        return scanner.nextInt();
    }
}
