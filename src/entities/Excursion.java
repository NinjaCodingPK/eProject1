package entities;

import java.util.ArrayList;

/**
 * Created by wookie on 5/28/16.
 */
public class Excursion extends TourType {
    ArrayList<String> route;

    public Excursion() {

    }

    public Excursion(String name, ArrayList<String> route) {
        super(Constants.EXCURSION);
        this.route = route;
    }

    public ArrayList<String> getRoute() {
        return route;
    }

    public void setRoute(ArrayList<String> route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "route=" + route +
                '}';
    }
}
