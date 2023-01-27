package models;

public class Price {
    public Price() {}

    private Integer price;

    public Price(Integer price)
    {
        super();
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
