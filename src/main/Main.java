package main;

import entities.*;
import model.TourList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by wookie on 5/28/16.
 */
public class Main {
    public static void main(String[] args) {
        //Tour t[] = new Tour[]{new Tour(100, 12, "country", "bus", "bus", new Cruise("type of ship"))};

        TourList tours = new TourList();
        tours.addTour(new Tour(101, 12, "country", false, "bus", new Cruise("type of ship")));
        tours.addTour(new Tour(102, 12, "country", true, "bus", new Cruise("type of ship")));
        tours.addTour(new Tour(100, 12, "country", false, " not a bus", new Cruise("type of ship")));

//        for(Tour t : tours.getTours()) {
//            System.out.println(t);
//        }
//
//        tours.sortByCost();
//
//        for(Tour t : tours.getTours()) {
//            System.out.println(t);
//        }

        List<Tour> f = tours.findByTransport("bus");
        for(Tour t : f) {
            System.out.println(t);
        }
    }
}
