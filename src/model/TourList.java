package model;

import entities.Tour;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by wookie on 5/29/16.
 */
public class TourList {
    private ArrayList<Tour> tours = new ArrayList<>();

    public TourList() {

    }

    public TourList(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    public void sortByCost() {
        Collections.sort(tours, new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {
                if(o1.getCost() < o2.getCost())
                    return -1;
                else
                    if(o1.getCost() > o2.getCost())
                        return 1;
                else
                        return 0;
            }
        });
    }

    public void sortByDuration() {
        Collections.sort(tours, new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {
                if(o1.getDuration() < o2.getDuration())
                    return -1;
                else
                if(o1.getDuration() > o2.getDuration())
                    return 1;
                else
                    return 0;
            }
        });
    }

    public List<Tour> findByCost(int cost) {
        return tours.stream()
                .filter(t -> t.getCost() == cost)
                .collect(Collectors.toList());
    }

    public List<Tour> findByDuration(int duration) {
        return tours.stream()
                .filter(t -> t.getDuration() == duration)
                .collect(Collectors.toList());
    }

    public List<Tour> findByTransport(String transport) {
        return tours.stream()
                .filter(t -> t.getTransport().equals(transport))
                .collect(Collectors.toList());
    }

    public void addTour(Tour tour) {
        tours.add(tour);
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public void setTours(ArrayList<Tour> tours) {
        this.tours = tours;
    }
}
