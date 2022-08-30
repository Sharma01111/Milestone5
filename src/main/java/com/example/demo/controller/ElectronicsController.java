package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.course.Electronics;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.service.ElectronicsService;

@RestController
public class ElectronicsController 
{
	@Autowired
	private ElectronicsService electronicService;
	@RequestMapping("/electronics")
	public List<Electronics> getAllElectronics()
	{
		List<Electronics> electronic = electronicService.getAllElectronics();
		
		if(electronic.size() <= 0)
			throw new UserNotFoundException("Electronics items are not present. First Post the data and then recheck Get");
			
	  return electronic;
	}
	
	@GetMapping("/electronics/{id}")
	public Electronics getCourse(@PathVariable Integer id)
	{
		Electronics electronic = electronicService.getElectronics(id);
		
		if(electronic ==  null)
			throw new UserNotFoundException(" Electronic_Item Id is not present");
			
	  return electronic;
	}
	@RequestMapping(method =RequestMethod.POST , value="/electronics" )
	public void addcourse(@RequestBody Electronics electronic)
	{
		electronicService.addElectronics(electronic);
	}
	@RequestMapping(method =RequestMethod.PUT , value="/electronics/{id}" )
	public void updatecourse(@PathVariable Integer id ,@RequestBody Electronics electronic)
	{
		electronicService.updateElectronic(id,electronic);
		
		
	}
	@RequestMapping(method =RequestMethod.DELETE , value="/electronics/{id}" )
	public void DeleteCourse(@PathVariable Integer id)
	{
		electronicService.deleteElectronic(id);
	}
}