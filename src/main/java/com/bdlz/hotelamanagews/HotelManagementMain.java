package com.bdlz.hotelamanagews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelManagementMain {
    Map<String, Hotel> hotelList = new HashMap<>();
    Hotel hotel;

    public boolean addHotel(String hotelName, int ratesForRegularCustomerWeekdays, int ratesForRegularCustomerWeekend,
                            int ratesForRewardCustomerWeekdays, int ratesForRewardCustomerWeekend) {
        hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setRatesForRegularCustomerWeekdays(ratesForRegularCustomerWeekdays);
        hotel.setRatesForRegularCustomerWeekend(ratesForRegularCustomerWeekend);
        hotel.setRatesForRewardCustomerWeekdays(ratesForRewardCustomerWeekdays);
        hotel.setRatesForRewardCustomerWeekend(ratesForRewardCustomerWeekend);
        hotelList.put(hotelName,hotel);
        return true;
    }

    public static void main(String[] args) {
    }

}
