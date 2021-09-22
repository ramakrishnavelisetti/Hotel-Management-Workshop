package com.bdlz.hotelamanagews;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HotelReservationTest {
    @Test
    public void givenHotel_input_shouldHotelGetAdd() {
        Hotel hotel1 = new Hotel("Lakewood",110,90,80,80);
        Hotel hotel2 = new Hotel("Bridgewood",160,60,110,50);
        Hotel hotel3 = new Hotel("Ridgewood",220,150,100,40);
        List<Hotel> hotelsList = new ArrayList<>();
        hotelsList.add(hotel1);
        hotelsList.add(hotel2);
        hotelsList.add(hotel3);
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel(hotel1);
        hotelReservation.addHotel(hotel2);
        hotelReservation.addHotel(hotel3);
        List<Hotel> getHotelList = hotelReservation.getHotels();
        assertEquals(hotelsList, getHotelList);

        for (Hotel hotel: hotelsList) {
            System.out.println("");
            System.out.println(hotel);
        }
    }
}