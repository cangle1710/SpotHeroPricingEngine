package models;

public class Rate {
    public Rate() {}

    private String days;
    private String times;
    private String tz;
    private Integer price;

    public Rate(String days, String times, String tz, Integer price)
    {
        super();
        this.days = days;
        this.times = times;
        this.tz = tz;
        this.price = price;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
