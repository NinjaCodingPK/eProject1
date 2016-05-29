package entities;

/**
 * Created by wookie on 5/28/16.
 */
public abstract class TourType {
    private String name;

    TourType() {

    }

    public TourType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TourType{" +
                "name='" + name + '\'' +
                '}';
    }
}
