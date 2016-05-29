package entities;

/**
 * Created by wookie on 5/28/16.
 */
public  class Tour {
    private int cost;
    private int duration;
    private String country;
    private boolean feeding;
    private String transport;
    private TourType type;

    Tour() {

    }

    public Tour(int cost, int duration, String country, boolean feeding, String transport, TourType type) {
        this.cost = cost;
        this.duration = duration;
        this.country = country;
        this.feeding = feeding;
        this.transport = transport;
        this.type = type;
    }

    public boolean isFeeding() {
        return feeding;
    }

    public void setFeeding(boolean feeding) {
        this.feeding = feeding;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public TourType getType() {
        return type;
    }

    public void setType(TourType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "type=" + type +
                ", transport='" + transport + '\'' +
                ", feeding=" + feeding +
                ", country='" + country + '\'' +
                ", duration=" + duration +
                ", cost=" + cost +
                '}';
    }
}
