package com.xworkz.dominoz;

import com.xworkz.dominoz.dto.DominozDTO;
import com.xworkz.dominoz.service.DominozServiceImpl;

public class Mainapp {

	public static void main(String[] args) {



		DominozDTO dominozDTO = new DominozDTO("Tamoto ", "koramangala", true, "veg", "Medium", 120);
		DominozServiceImpl dominozServiceImpl = new DominozServiceImpl();
		dominozServiceImpl.validatePizzaDetails(dominozDTO);
		dominozServiceImpl.validatePizzaDetailsById();
		dominozServiceImpl.updateThePizzaDetails();
		dominozServiceImpl.deleteThePizzadetails();
}

}