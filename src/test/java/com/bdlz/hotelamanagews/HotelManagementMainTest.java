package com.bdlz.hotelamanagews;

import org.junit.Test;

import static org.junit.Assert.*;

public class HotelManagementMainTest {
    HotelManagementMain hotelManagementMain = new HotelManagementMain();
    @Test
    public void givenInput_IsTrue_shouldReturnTrue() {
        hotelManagementMain.addHotel("Lakewood",110,90,80,80);
        hotelManagementMain.addHotel("Bridgewood",160,60,110,50);
        hotelManagementMain.addHotel("Ridgewood",220,150,100,40);
    }
}