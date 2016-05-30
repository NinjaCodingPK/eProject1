package main;

import controller.Controller;
import entities.*;
import model.TourList;
import view.View;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by wookie on 5/28/16.
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        TourList tours = new TourList();
        Controller controller = new Controller(tours, view);

        controller.processUser();
    }
}
