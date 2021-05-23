package com.xworkz.dominoz;

import com.xworkz.dominoz.dto.DominozDTO;
import com.xworkz.dominoz.service.DominozServiceImpl;

public class Mainapp {

	public static void main(String[] args) {



		DominozDTO dominozDTO = new DominozDTO("Margherita ", "HSR Layout", true, "Nonveg", "Medium", 350);
		DominozServiceImpl dominozServiceImpl = new DominozServiceImpl();
		dominozServiceImpl.validatePizzaDetails(dominozDTO);
		dominozServiceImpl.validatePizzaDetailsById();
		
}

}