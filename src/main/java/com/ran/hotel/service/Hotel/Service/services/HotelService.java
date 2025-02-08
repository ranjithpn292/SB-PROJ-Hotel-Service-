package com.ran.hotel.service.Hotel.Service.services;

import com.ran.hotel.service.Hotel.Service.entities.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    Hotel save(Hotel hotel);

    List<Hotel> getAllHotels();

    Optional<Hotel> getHotelById(String Id);
}
