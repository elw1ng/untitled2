package Controller;

import java.io.IOException;

public class NotIntegerInputException extends IOException {
    public  NotIntegerInputException(String message) {
        super(message);
    }
}