package Model;

import java.util.Random;

public  class Randomiser {
    private final Random random = new Random();
   private String[] Firstnames = new String[]{"Ivan     ","Vasyliy ","Bogdan   ","Nazariy ","Andriy   ","Adam    ","Volodymyr","Dmitriy ","Olexandr ","Oleg    "};
    private String[] Secondnames = new String[]{"Hrytsyk  ","Smerechuk ","Kinchur ","Yaremchuk","Bilous  ","Hramchenko","Yaroviy ","Andreychuk","Pendorak  ","Mushak  "};
    private int[] routes = new int[]{231,345,243};
    private String[] brands = new String[]{"Mersedes","Bogdan   ","Etalon   "};
    String RandomFirstName()
    {
        int x=random.nextInt(121212);
        int y=x%Firstnames.length;
        String s=Firstnames[y];
        return s;
    }
    String RandomSecondName()
    {
        return Secondnames[random.nextInt(121212)% Secondnames.length];
    }
    int Randomroute()
    {
        return routes[random.nextInt(121212)% routes.length];
    }
    String RandomBrand()
    {
        return brands[random.nextInt(121212)% brands.length];
    }
    int RandomYear()
    {
        return 1991+random.nextInt(121212)%30;
    }
    int RandomRun()
    {
        return 70000+random.nextInt(321212)%90000;
    }
}
