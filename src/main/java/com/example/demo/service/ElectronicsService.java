package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.course.Electronics;
import com.example.demo.repository.ElectronicsRepository;

@Service
public class ElectronicsService {
	@Autowired
	public ElectronicsRepository electronicRepo;

public List<Electronics> getAllElectronics() {
	// TODO Auto-generated method stub
	List<Electronics> courses =new ArrayList<>();
	electronicRepo.findAll().forEach(courses::add);
	return courses;
}

public Electronics getElectronics(Integer id) {
	// TODO Auto-generated method stub
     try
     {
	return electronicRepo.findById(id).get();
     }
     catch(Exception e)
     {
    	 return null;
     }
}

public void addElectronics(Electronics electronic) {
	electronicRepo.save(electronic);
	// TODO Auto-generated method stub
	
}

public void updateElectronic(Integer id, Electronics electronic) {
	// TODO Auto-generated method stub
	electronicRepo.save(electronic);
	}

public void deleteElectronic(Integer id) {
	// TODO Auto-generated method stub
	electronicRepo.deleteById(id);
	}
}



