package Controller;
import view.View;
import Controller.InputRangeException;
public class Validator {

    public static void checkForInputRange(int x,View view) throws InputRangeException {
        if ( x>4 || x <0 )
            throw new InputRangeException(view.wrongInput);
    }
}
