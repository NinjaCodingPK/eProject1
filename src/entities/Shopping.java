package entities;

/**
 * Entity class which realize Shopping, extends Tour.
 * Created by wookie on 5/28/16.
 */
public class Shopping extends Tour {
    private String shopType;

    public Shopping() {

    }

    public Shopping(String shopType) {
        this.shopType = shopType;
    }

    public Shopping(int cost, int duration, String country, boolean feeding, String transport, String shopType) {
        super(cost, duration, country, feeding, transport, TourType.Shopping);
        this.shopType = shopType;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    @Override
    public String toString() {
        return "Shopping{" + super.toString() +
                "shopType='" + shopType + '\'' +
                '}';
    }
}
