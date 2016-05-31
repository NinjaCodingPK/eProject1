package model;

import entities.Tour;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by wookie on 5/29/16.
 */
public class TourList {
    private List<Tour> tours = new ArrayList<>();

    public TourList() {

    }

    public TourList(List<Tour> tours) {
        this.tours = tours;
    }

    /**
     * Method sorts tours by cost.
     */
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

    /**
     * Method sorts tours by duration.
     */
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

    /**
     * Method uses filter to find responded tours by Predicate.
     * @param p Predicate<Tour>.
     * @return list of tours, which responds a Predicate.
     * */
    private List<Tour> findByPredicate(Predicate<Tour> p) {
        return tours.stream()
                .filter(p)
                .collect(Collectors.toList());
    }

    /**
     * Method search lists, which responds specified cost value.
     * @param cost int value.
     * @return list of tours with specified cost.
     */
    public List<Tour> findByCost(int cost) {
        return findByPredicate(getCostPredicate(cost));
    }

    /**
     * Method search lists, which responds specified duration value.
     * @param duration int value.
     * @return list of tours with specified duration.
     */
    public List<Tour> findByDuration(int duration) {
        return findByPredicate(getDurationPredicate(duration));
    }

    /**
     * Method search lists, which responds specified transport value.
     * @param transport String value.
     * @return list of tours with specified transport.
     */
    public List<Tour> findByTransport(String transport) {
        return findByPredicate(getTransportPredicate(transport));
    }

    /**
     * Method returns cost predicate.
     * @param cost int value.
     * @return cost predicate.
     */
    private Predicate<Tour> getCostPredicate(int cost) {
        return t -> t.getCost() == cost;
    }

    /**
     * Method returns duration predicate.
     * @param duration int value.
     * @return duration predicate.
     */
    private Predicate<Tour> getDurationPredicate(int duration) {
        return t -> t.getDuration() == duration;
    }

    /**
     * Method returns transport predicate.
     * @param transport String value.
     * @return transport predicate.
     */
    private Predicate<Tour> getTransportPredicate(String transport) {
        return t -> t.getTransport().equals(transport);
    }

    /**
     * Method adds tour into list of tours.
     * @param tour entities.Tour.
     */
    public void addTour(Tour tour) {
        tours.add(tour);
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }
}
