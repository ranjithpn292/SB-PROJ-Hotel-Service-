package com.ran.hotel.service.Hotel.Service.controllers;

import com.ran.hotel.service.Hotel.Service.entities.Hotel;
import com.ran.hotel.service.Hotel.Service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        String hotelid = UUID.randomUUID().toString();
        hotel.setId(hotelid);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.save(hotel));
    }


    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel(){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotels());
    }

    @GetMapping("/{Id}")
    public ResponseEntity<Optional<Hotel>> getById(@PathVariable String Id){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotelById(Id));
    }



}
