package entities;

/**
 * Entity class which realize Treatment, extends Tour.
 * Created by wookie on 5/28/16.
 */
public class Treatment extends Tour {
    private String disease;

    public Treatment() {

    }

    public Treatment(String disease) {
        this.disease = disease;
    }

    public Treatment(int cost, int duration, String country, boolean feeding, String transport, String disease) {
        super(cost, duration, country, feeding, transport, TourType.Treatment);
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Treatment{" + super.toString() +
                "desease='" + disease + '\'' +
                '}';
    }
}
