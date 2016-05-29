package entities;

/**
 * Created by wookie on 5/28/16.
 */
public class Shopping extends TourType {
    private String shopType;

    public Shopping() {

    }

    public Shopping(String name, String shopType) {
        super(Constants.SHOPPING);
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
        return "Shopping{" +
                "shopType='" + shopType + '\'' +
                '}';
    }
}
