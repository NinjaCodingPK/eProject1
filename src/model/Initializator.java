package model;

import entities.*;

import java.util.ArrayList;

/**
 * Class initialize the start entry of tours.
 * Created by wookie on 5/30/16.
 */
public class Initializator {
    public ArrayList<Tour> init() {
        ArrayList<Tour> temp = new ArrayList<>();
        temp.add(new Tour(101, 12, "country", true, "bus", new Cruise("small ship")));
        temp.add(new Tour(200, 7, "country", true, "bus", new Cruise("big ship")));
        temp.add(new Tour(1000, 5, "France", false, "plane", new Shopping("clothes")));
        temp.add(new Tour(500, 5, "Croatia", true, "plane", new Rest(5)));

        ArrayList<String> excursionRoute = new ArrayList<>();
        excursionRoute.add("Big Bang");
        excursionRoute.add("Some other");
        temp.add(new Tour(999, 4, "England", false, "bus", new Excursion(excursionRoute)));
        temp.add(new Tour(200, 14, "German", true, "bus", new Treatment("some disease")));
        return temp;
    }
}
