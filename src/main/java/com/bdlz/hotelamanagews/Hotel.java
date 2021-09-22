package com.bdlz.hotelamanagews;

public class Hotel {
    private String hotelName;
    private int ratesForRegularCustomerWeekdays;
    private int ratesForRegularCustomerWeekend;
    private int ratesForRewardCustomerWeekdays;
    private int ratesForRewardCustomerWeekend;

    public Hotel(String hotelName, int ratesForRegularCustomerWeekdays, int ratesForRegularCustomerWeekend,
                        int ratesForRewardCustomerWeekdays, int ratesForRewardCustomerWeekend) {
        this.hotelName = hotelName;
        this.ratesForRegularCustomerWeekdays = ratesForRegularCustomerWeekdays;
        this.ratesForRegularCustomerWeekend = ratesForRegularCustomerWeekend;
        this.ratesForRewardCustomerWeekdays = ratesForRewardCustomerWeekdays;
        this.ratesForRewardCustomerWeekend = ratesForRewardCustomerWeekend;
    }

    public Hotel() {

    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRatesForRegularCustomerWeekdays() {
        return ratesForRegularCustomerWeekdays;
    }

    public void setRatesForRegularCustomerWeekdays(int ratesForRegularCustomerWeekdays) {
        this.ratesForRegularCustomerWeekdays = ratesForRegularCustomerWeekdays;
    }

    public int getRatesForRegularCustomerWeekend() {
        return ratesForRegularCustomerWeekend;
    }

    public void setRatesForRegularCustomerWeekend(int ratesForRegularCustomerWeekend) {
        this.ratesForRegularCustomerWeekend = ratesForRegularCustomerWeekend;
    }

    public int getRatesForRewardCustomerWeekdays() {
        return ratesForRewardCustomerWeekdays;
    }

    public void setRatesForRewardCustomerWeekdays(int ratesForRewardCustomerWeekdays) {
        this.ratesForRewardCustomerWeekdays = ratesForRewardCustomerWeekdays;
    }

    public int getRatesForRewardCustomerWeekend() {
        return ratesForRewardCustomerWeekend;
    }

    public void setRatesForRewardCustomerWeekend(int ratesForRewardCustomerWeekend) {
        this.ratesForRewardCustomerWeekend = ratesForRewardCustomerWeekend;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", ratesForRegularCustomerWeekdays=" + ratesForRegularCustomerWeekdays +
                ", ratesForRegularCustomerWeekend=" + ratesForRegularCustomerWeekend +
                ", ratesForRewardCustomerWeekdays=" + ratesForRewardCustomerWeekdays +
                ", ratesForRewardCustomerWeekend=" + ratesForRewardCustomerWeekend +
                '}';
    }
}
