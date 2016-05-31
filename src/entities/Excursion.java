package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity class which realize Excursion, extends Tour.
 * Created by wookie on 5/28/16.
 */
public class Excursion extends Tour {
    List<String> route;

    public Excursion() {

    }

    public Excursion(ArrayList<String> route) {
        this.route = route;
    }

    public Excursion(int cost, int duration, String country, boolean feeding, String transport, List<String> route) {
        super(cost, duration, country, feeding, transport, TourType.Excursion);
        this.route = route;
    }

    public List<String> getRoute() {
        return route;
    }

    public void setRoute(List<String> route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "Excursion{" + super.toString() +
                "route=" + route +
                '}';
    }
}
