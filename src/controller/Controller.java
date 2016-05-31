package controller;

import model.Initializator;
import model.TourList;
import view.View;

/**
 * Created by wookie on 5/30/16.
 */
public class Controller {
    private TourList tours;
    private View view;

    public Controller(TourList tours, View view) {
        this.tours = tours;
        this.view = view;
    }

    public void processUser() {
        Initializator initializator = new Initializator();
        tours.setTours(initializator.init());

        view.printMessage(View.TOURS);
        view.printList(tours.getTours());

        tours.sortByCost();
        view.printMessage(View.SORTED_BY_COST);
        view.printList(tours.getTours());

        tours.sortByDuration();
        view.printMessage(View.SORTED_BY_DURATION);
        view.printList(tours.getTours());

        int i = 200;
        view.printMessage(View.GET_BY_COST, Integer.toString(i));
        view.printList(tours.findByCost(i));

        i = 5;
        view.printMessage(View.GET_BY_DURATION, Integer.toString(i));
        view.printList(tours.findByDuration(5));

        String transport = "bus";
        view.printMessage(View.GET_BY_TRANSPORT, transport);
        view.printList(tours.findByTransport(transport));
    }
}
