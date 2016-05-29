package entities;

/**
 * Created by wookie on 5/28/16.
 */
public class Rest extends TourType {
    private int hotelStars;

    public Rest() {

    }

    public Rest(String name, int hotelStars) {
        super(Constants.REST);
        this.hotelStars = hotelStars;
    }

    public int getHotelStars() {
        return hotelStars;
    }

    public void setHotelStars(int hotelStars) {
        this.hotelStars = hotelStars;
    }

    @Override
    public String toString() {
        return "Rest{" +
                "hotelStars=" + hotelStars +
                '}';
    }
}
