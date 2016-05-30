package view;

import entities.Tour;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wookie on 5/30/16.
 */
public class View {
    public final static String TOURS = "List of tours:";
    public final static String SORTED_BY_COST = "List of tours sorted by cost:";
    public final static String SORTED_BY_DURATION = "List of tours sorted by duration:";
    public final static String GET_BY_DURATION = "Tours got by duration";
    public final static String GET_BY_COST = "Tours got by cost";
    public final static String GET_BY_TRANSPORT = "Tours got by transport";

    public void printList(List<Tour> tours) {
        for(Tour t : tours) {
            System.out.println(t);
        }
        System.out.println();
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
