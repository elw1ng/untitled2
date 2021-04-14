package Model;

import java.util.Random;

public class Randomiser {
    private final Random random = new Random();
    private String[] firstnames = new String[]{"Ivan     ", "Vasyliy ", "Bogdan   ", "Nazariy ", "Andriy   ", "Adam    ", "Volodymyr", "Dmitriy ", "Olexandr ", "Oleg    "};
    private String[] secondnames = new String[]{"Hrytsyk  ", "Smerechuk ", "Kinchur ", "Yaremchuk", "Bilous  ", "Hramchenko", "Yaroviy ", "Andreychuk", "Pendorak  ", "Mushak  "};
    private int[] routes = new int[]{231, 345, 243};
    private String[] brands = new String[]{"Mersedes", "Bogdan   ", "Etalon   "};

    String randomFirstName() {
        int x = random.nextInt(121212);
        int y = x % firstnames.length;
        String s = firstnames[y];
        return s;
    }

    String randomSecondName() {
        return secondnames[random.nextInt(121212) % secondnames.length];
    }

    int randomRoute() {
        return routes[random.nextInt(121212) % routes.length];
    }

    String randomBrand() {
        return brands[random.nextInt(121212) % brands.length];
    }

    int randomYear() {
        return 1991 + random.nextInt(121212) % 30;
    }

    int randomRun() {
        return 70000 + random.nextInt(321212) % 90000;
    }

}
