package com.ran.hotel.service.Hotel.Service.repositories;

import com.ran.hotel.service.Hotel.Service.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
