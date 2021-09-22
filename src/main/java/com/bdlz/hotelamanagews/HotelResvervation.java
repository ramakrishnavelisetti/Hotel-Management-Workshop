package com.bdlz.hotelamanagews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class HotelReservation {
    private List<Hotel> hotels;

    public HotelReservation() {
        this.hotels = new ArrayList<Hotel>();
    }
    public void addHotel(Hotel hotel) {
        this.hotels.add(hotel);
    }
    public List<Hotel> getHotels() {
        return this.hotels;
    }
}
