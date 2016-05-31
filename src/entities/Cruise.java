package entities;

/**
 * Entity class which realize Cruise, extends Tour.
 * Created by wookie on 5/28/16.
 */
public class Cruise extends Tour {
    private String typeOfShip;

    public Cruise() {

    }

    public Cruise(String typeOfShip) {
        this.typeOfShip = typeOfShip;
    }

    public Cruise(int cost, int duration, String country, boolean feeding, String transport, String typeOfShip) {
        super(cost, duration, country, feeding, transport, TourType.Cruise);
        this.typeOfShip = typeOfShip;
    }

    public String getTypeOfShip() {
        return typeOfShip;
    }

    public void setTypeOfShip(String typeOfShip) {
        this.typeOfShip = typeOfShip;
    }

    @Override
    public String toString() {
        return "Cruise{" + super.toString() +
                "typeOfShip='" + typeOfShip + '\'' +
                '}';
    }
}
