package entities;

/**
 * Created by wookie on 5/28/16.
 */
public class Treatment extends TourType {
    private String desease;

    public Treatment() {

    }

    public Treatment(String name, String desease) {
        super(Constants.TREATMENT);
        this.desease = desease;
    }

    public String getDesease() {
        return desease;
    }

    public void setDesease(String desease) {
        this.desease = desease;
    }

    @Override
    public String toString() {
        return "Treatment{" +
                "desease='" + desease + '\'' +
                '}';
    }
}
