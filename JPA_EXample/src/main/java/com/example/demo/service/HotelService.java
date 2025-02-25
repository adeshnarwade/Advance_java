package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hotel;
import com.example.demo.repository.HotelRepository;



@Service
public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	//getting data
	
	public List<Hotel> getAllHotel(){
		return hotelRepository.findAll();
	}
	
	//saving hotel
	public Hotel saveHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}
	
	//updating 
	
	public Hotel updatHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}
	
	public Hotel getHotelbyId(Long id) {
		return hotelRepository.findById(id).orElse(null);
	}
	
	//deleting Hotel by id
	public boolean deletHotelById(Long id) {
		if(hotelRepository.existsById(id)){
			hotelRepository.deleteById(id);
			 return true;
		}else{
			return false;
	}
		
	}

}
