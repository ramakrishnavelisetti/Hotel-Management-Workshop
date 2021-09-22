package com.bdlz.hotelamanagews;

public class Hotel {
    private String hotelName;
    private int rateForRegularCustomerWeekdays;
    private int rateForRegularCustomerWeekend;
    private int rateForRewardCustomerWeekdays;
    private int rateForRewardCustomerWeekend;

    public Hotel(String hotelName, int rateForRegularCustomerWeekdays, int rateForRegularCustomerWeekend,
                 int rateForRewardCustomerWeekdays, int rateForRewardCustomerWeekend) {
        this.hotelName = hotelName;
        this.rateForRegularCustomerWeekdays = rateForRegularCustomerWeekdays;
        this.rateForRegularCustomerWeekend = rateForRegularCustomerWeekend;
        this.rateForRewardCustomerWeekdays = rateForRewardCustomerWeekdays;
        this.rateForRewardCustomerWeekend = rateForRewardCustomerWeekend;
    }
    public Hotel() {

    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRateForRegularCustomerWeekdays() {
        return rateForRegularCustomerWeekdays;
    }

    public void setRateForRegularCustomerWeekdays(int rateForRegularCustomerWeekdays) {
        this.rateForRegularCustomerWeekdays = rateForRegularCustomerWeekdays;
    }

    public int getRateForRegularCustomerWeekend() {
        return rateForRegularCustomerWeekend;
    }

    public void setRateForRegularCustomerWeekend(int rateForRegularCustomerWeekend) {
        this.rateForRegularCustomerWeekend = rateForRegularCustomerWeekend;
    }

    public int getRateForRewardCustomerWeekdays() {
        return rateForRewardCustomerWeekdays;
    }

    public void setRateForRewardCustomerWeekdays(int rateForRewardCustomerWeekdays) {
        this.rateForRewardCustomerWeekdays = rateForRewardCustomerWeekdays;
    }

    public int getRateForRewardCustomerWeekend() {
        return rateForRewardCustomerWeekend;
    }

    public void setRateForRewardCustomerWeekend(int rateForRewardCustomerWeekend) {
        this.rateForRewardCustomerWeekend = rateForRewardCustomerWeekend;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", rateForRegularCustomerWeekdays=" + rateForRegularCustomerWeekdays +
                ", rateForRegularCustomerWeekend=" + rateForRegularCustomerWeekend +
                ", rateForRewardCustomerWeekdays=" + rateForRewardCustomerWeekdays +
                ", rateForRewardCustomerWeekend=" + rateForRewardCustomerWeekend +
                '}';
    }
}
