package Controller;
import view.View;
import Controller.InputRangeException;
import Controller.NotIntegerInputException;
import java.util.Scanner;
public class Validator {

    public static void checkForInputRange(int x,View view) throws InputRangeException {
        if ( x>4 || x <0 )
            throw new InputRangeException(view.wrongInput);
    }
    public static void checkForNotInt(Scanner scanner,View view) throws NotIntegerInputException {
        if ( !scanner.hasNextInt())
            throw new NotIntegerInputException(view.notIntegerInput);
    }
}
