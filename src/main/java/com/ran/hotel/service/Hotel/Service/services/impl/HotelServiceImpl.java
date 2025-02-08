package com.ran.hotel.service.Hotel.Service.services.impl;

import com.ran.hotel.service.Hotel.Service.entities.Hotel;
import com.ran.hotel.service.Hotel.Service.repositories.HotelRepository;
import com.ran.hotel.service.Hotel.Service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepostory;

    @Override
    public Hotel save(Hotel hotel) {
        return hotelRepostory.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepostory.findAll();
    }

    @Override
    public Optional<Hotel> getHotelById(String Id) {
        return hotelRepostory.findById(Id);
    }
}
