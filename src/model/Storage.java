package model;

import java.util.Arrays;

public class Storage {

    private Autobus[] autobusPark = new Autobus[10];

    public Storage() {
        Randomiser rand = new Randomiser();
        for (int i = 0; i <  autobusPark.length; i++) {
            autobusPark[i] = new Autobus(rand.randomFirstName(), rand.randomSecondName(), i, rand.randomRoute(), rand.randomBrand(), rand.randomYear(), rand.randomRun());
        }
    }



    public Autobus[] getAll() {
        return Arrays.copyOf(autobusPark,autobusPark.length);
    }



}
