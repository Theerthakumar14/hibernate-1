package com.xworkz.dominoz.service;

import com.xworkz.dominoz.dto.DominozDTO;

public interface DominozService {
	 public boolean validatePizzaDetails(DominozDTO dominozdto);
	 
	 public void validatePizzaDetailsById(); 
	 
	 public void updateThePizzaDetails();
	 
	 public void deleteThePizzadetails();


}
