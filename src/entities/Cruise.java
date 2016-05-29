package entities;

/**
 * Created by wookie on 5/28/16.
 */
public class Cruise extends TourType {
    private String typeOfShip;

    public Cruise() {

    }

    public Cruise(String typeOfShip) {
        super(Constants.CRUISE);
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
        return "Cruise{" +
                "typeOfShip='" + typeOfShip + '\'' +
                '}';
    }
}
