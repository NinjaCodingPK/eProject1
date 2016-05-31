package entities;

/**
 * Entity class which realize Rest, extends Tour.
 * Created by wookie on 5/28/16.
 */
public class Rest extends Tour {
    private int hotelStars;

    public Rest() {

    }

    public Rest(int hotelStars) {
        this.hotelStars = hotelStars;
    }

    public Rest(int cost, int duration, String country, boolean feeding, String transport, int hotelStars) {
        super(cost, duration, country, feeding, transport, TourType.Rest);
        setHotelStars(hotelStars);
    }

    public int getHotelStars() {
        return hotelStars;
    }

    public void setHotelStars(int hotelStars) {
        if((hotelStars >= 1) && (hotelStars <= 5))
            this.hotelStars = hotelStars;
    }

    @Override
    public String toString() {
        return "Rest{" + super.toString() +
                "hotelStars=" + hotelStars +
                '}';
    }
}
