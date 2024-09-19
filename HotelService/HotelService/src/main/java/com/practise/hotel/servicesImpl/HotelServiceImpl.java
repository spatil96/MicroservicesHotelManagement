package com.practise.hotel.servicesImpl;

import com.practise.hotel.entities.Hotel;
import com.practise.hotel.exceptions.ResourceNotFoundException;
import com.practise.hotel.repository.HotelRepository;
import com.practise.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
        String uuid= UUID.randomUUID().toString();
        hotel.setId(uuid);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String Id) {
        return hotelRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("RessourceNotFound"));
    }
}
