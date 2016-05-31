package model;

import entities.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Class initialize the start entry of tours.
 * Created by wookie on 5/30/16.
 */
public class Initializator {

    /**
     * Method forms start entry of tours.
     * @return initialized list of tours.
     */
    public ArrayList<Tour> init() {
        ArrayList<Tour> temp = new ArrayList<>();
        temp.add(new Cruise(101, 12, "country", true, "bus", "small ship"));
        temp.add(new Cruise(200, 7, "country", true, "bus", "big ship"));
        temp.add(new Shopping(1000, 5, "France", false, "plane", "clothes"));
        temp.add(new Rest(500, 5, "Croatia", true, "plane", 5));

        List<String> excursionRoute = new ArrayList<>();
        excursionRoute.add("Big Bang");
        excursionRoute.add("Some other");
        temp.add(new Excursion(999, 4, "England", false, "bus", excursionRoute));
        temp.add(new Treatment(200, 14, "German", true, "bus", "some disease"));
        return temp;
    }
}
