package Model;
import Model.Storage;

import java.util.Arrays;

public class Sorter {
    private Storage storage = new Storage();
    public  Autobus[] getwithRoute(int route) {
        Autobus[] park = storage.getAll();
        Autobus[] sortedPark = new Autobus[park.length];
        int k=0;
        for (int i = 0; i < park.length; i++) {
            if (park[i].getRoute() == route) {
                sortedPark[k]=park[i];
                k++;
            }
        }

        return Arrays.copyOf(sortedPark,k);
    }

    public Autobus[] getwithYear(int time) {
        Autobus[] park = storage.getAll();
        Autobus[] sortedPark = new Autobus[park.length];
        int k=0;
        for (int i = 0; i < park.length; i++) {
            if (2021 - park[i].getStartYear() > time) {
                sortedPark[k]=park[i];
                k++;
            }

        }
        return Arrays.copyOf(sortedPark,k);
    }

    public Autobus[] getwithRun(int run) {
        Autobus[] park = storage.getAll();
        Autobus[] sortedPark = new Autobus[park.length];
        int k=0;
        for (int i = 0; i < park.length; i++) {
            if (park[i].getRun() > run) {
                sortedPark[k]=park[i];
                k++;
            }

        }
        return Arrays.copyOf(sortedPark,k);
    }
    public Autobus[] getAll() {
        return storage.getAll();
    }
}
