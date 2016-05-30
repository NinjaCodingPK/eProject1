package entities;

/**
 * Created by wookie on 5/28/16.
 */
public class Treatment extends TourType {
    private String disease;

    public Treatment() {

    }

    public Treatment(String disease) {
        super(Constants.TREATMENT);
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
        return "Treatment{" +
                "desease='" + disease + '\'' +
                '}';
    }
}
